package AbstractClass;

public class Lenovo extends SampleAC{

    public void cut(){
        System.out.println("THis is cut code");
    }
    
    public void keyboard(){
        System.out.println("This is keyboard code");
    }
    
}
/*
we have tak4n same example as interface -
   Laptop interface
   Lenovo class
   Apple class

*/

/*
here we have created an abstract class SampleAC and we can place the methods that we  are required to use in more than one class 
rather than placing the required methods in every class by implementing the laptop interface this abstarct is the best way 
here the copy() and paste() code can used by all the  class interfacing interfcae because SampleAC abstarct class implemnting Laptop interface
so all the required classes can extend the AbstractAC class using extends
and here there are 4 abstarct methods in the Laptop interface and the abstarct class implemented 2 so the classes extending SanpleAC dont required
to implement the 2 methods 
and the other classes need to implement other 2 methods which are not implemente in abstarct class 
Abstarct class provides partial implementation for the methods that are declared in the Interface means it can provide implementation for few methods also
Abstarct class contains both implemented and unimplemented methods but the unimplemented methods need to write with abstarct keyword
           like public abstarct void cut(); 
        
*/

