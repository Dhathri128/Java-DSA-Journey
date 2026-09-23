package LinkedList;



class Node{
    int data;
    Node next;
    
    public Node(int data){
        this.data= data;
        this.next = null;
    }
}
class SearchElement
{
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
		
		Node curr = head;
		int target = 50;
		boolean found = false;
		while(curr != null){
		    if(curr.data == target){
		        found = true;
		        break;
		    }
		    curr = curr.next;
		}
		
		if(found){
		    System.out.println("Element Found");
		}else{
		    System.out.println("Element not found");
		}

	}
}

