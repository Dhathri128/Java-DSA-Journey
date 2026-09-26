
import java.util.*;
class TypeInference
{   
    int val = 20; // allowed 
    //var j = 20; // not allowed 
	public static void main (String[] args) 
	{
		// your code goes here
        var balance = 20000000;
        int available = 2000;
        var name = "hello";
        System.out.println(balance);
        System.out.println(available);
        System.out.println(name);
        
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        
        int[] array1 = {10,20,30,40};
        
        var arr = new int[6];
        
        var arr1 = new int[]{10,20,30,40};
	}

}
