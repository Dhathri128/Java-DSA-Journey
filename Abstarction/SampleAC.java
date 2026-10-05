package Abstarction;

public abstract class SampleAC implements Laptop{
    public void copy(){
        System.out.println("This is copy code");
    }

    public void paste(){
        System.out.println("This is paste code");
    }
    
    abstract public void cut();// we can remove java wont throw errors

    abstract public void keyboard(); // here also if want to wrrite like this have to write abstarct keyword 
}