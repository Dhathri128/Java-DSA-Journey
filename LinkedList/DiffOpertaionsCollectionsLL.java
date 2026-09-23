package LinkedList;

import java.util.LinkedList;

public class DiffOpertaionsCollectionsLL {
    

	public static void main (String[] args)
	{
		// your code goes here
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		
		System.out.println(ll);
		for(int num: ll){
		    System.out.println(num);
		}
        
        System.out.println(ll.contains(30));
	}
}


