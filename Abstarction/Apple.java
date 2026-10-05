package Abstarction;

public class Apple extends SampleAC {
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
