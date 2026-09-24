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
class ReverseLL
{
	public static void main (String[] args) 
	{
		// your code goes here
		Node head= new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		Node fifth = new Node(50);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		
		
		Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null) {
            next = curr.next;   // save next
            curr.next = prev;   // reverse link
            prev = curr;        // move prev
            curr = next;        // move curr
        }

        head = prev;
        curr = head;
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
	}
}
