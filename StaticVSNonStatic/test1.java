package StaticVSNonStatic;
import java.util.*;

class test1
{
    static int number;
	public static void main (String[] args) 
	{
		test1.number = new Random().nextInt();
		test1.number = new Random().nextInt();
		System.out.println(test1.number);
		System.out.println(test1.number);
		

	}
	
	public static void print(){
	    System.out.println("This is Static Block and implemented in class test1");
	}
	
	public void print2(){
	    System.out.println("This is a Non static Block also implemented in the class teat1");
	}
}
