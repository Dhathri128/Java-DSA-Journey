package Basic;



public class StaticNonStatic{
    static{
        
        System.out.println("This is a Static-Block");
    }
    
    {
        System.out.println("This is non static block");
    }
   
     
    //public StaticNonStatic(){                          even when i comment this explicit constrctor and call the object in main method in line 23,
      // System.out.println("This is a Constructor");     NSB is called and printed due to default instructor . if i uncomment this then this block be
    //}                                                  printed  after the non static block 
	public static void main (String[] args)               
	{
		// your code goes here
		System.out.println("Main method");
		new StaticNonStatic();
		

	}
}
