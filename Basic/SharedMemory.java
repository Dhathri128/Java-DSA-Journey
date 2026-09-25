package Basic;
import java.util.*;
class SharedMemory {
    int number;
    //static int number;
	public static void main (String[] args) 
	{
		// your code goes here
		
		SharedMemory c1 = new SharedMemory();
		c1.number = new Random().nextInt();
		
		SharedMemory c2 = new SharedMemory();
		c2.number = new Random().nextInt();
		
		SharedMemory c3 = new SharedMemory();
		c3.number = new Random().nextInt();
		
		System.out.println(c1.number);
		System.out.println(c2.number);
		System.out.println(c3.number);
		

	}
}