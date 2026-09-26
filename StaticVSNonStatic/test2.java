package StaticVSNonStatic;

import java.util.*;

public class test2{
	public static void main (String[] args)
	{
		test1.print();
		//test1.print2();  for this Cannot make a static reference to the non-static method print2() from the type test1Java(603979977)
                           //void StaticVSNonStatic.test1.print2()
        //so we will create object of the first class and then will call the non static print2() method
       // print is defined using static keyword 
       test1 t1= new test1();
       t1.print2();
	}
}
