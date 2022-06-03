// { 

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

class GFG {
	public static void main (String[] args) {
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    Node head = new Node(sc.nextInt());
		    Node tail = head;
		    
		    for(int i=1; i<n; i++){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		    
		    Solution obj = new Solution();
		    System.out.println(obj.sum(head, k));
		}
	}
}// } Driver Code Ends


/*
Node class is as follows:

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    
    //Return the sum of last k nodes
    public int sum(Node head, int k){
     int sum=0;
     int count=0;
     Node temp=head;
     if(head==null)
     {
         return 0;
     }
     if(head.next==null)
     {
         return head.data;
     }
     for(;temp!=null;temp=temp.next)
     {
         count++;
     }
     int x=count-k;
     Node temp2=head;
     for(int i=0;i<x;i++,temp2=temp2.next);
     
     for(;temp2!=null;temp2=temp2.next)
     {
         sum=sum+temp2.data;
     }
      return sum;
    }
}