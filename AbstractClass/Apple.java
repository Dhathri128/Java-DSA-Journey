package AbstractClass;

public class Apple extends SampleAC {
    
   public void copy(){
        System.out.println("This is copy code");// IF WE WANT WE CAN WRITE IT ACTS AS OVERIDE IF USER WANT TO ADD EXTRA IMPLEMENTATION 
    }                                             //IF WE WONT WRITE THIS ALSO IT WORKS AS COPY() IS IMPLEMENTED IN THE SampleAC AND THIS 
                                                  //Apple EXTENDING IT 



    public void cut(){ // need to implement this method  as sampleAC implementing Laptop ,Laptop contains this as abstarct method
        System.out.println("THis is cut code");
    }
    
    public void keyboard(){//same with here if not java thorws error 
        System.out.println("This is keyboard code");
    }

    public void capture(){
        System.out.println("This is capture code");
    }
    
}
