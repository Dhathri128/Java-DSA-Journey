package LinkedList;


import java.util.*;
import java.lang.*;
import java.io.*;


class Node{
	    int data;
	    Node next;
	    
	    Node(int data){
	        this.data = data;
	        this.next = null;
	    }
}
class Traversal{
	public static void main (String[] args) 
	{
		// your code goes here
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);       
		Node fourth = new Node(40);       
		head.next = second;
		second.next = third;
		third.next = fourth;
		
	
    /*  Node head = new Node(10);
	    head.next = new Node(20);
	    head.next.next = new Node(30);
	    head.next.next.next = new Node(40);
	*/ 
		Node curr= head;
		while(curr != null){
		    System.out.println(curr.data);
		    curr = curr.next;
		}
        
	}
}