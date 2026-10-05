package AbstractClass;

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


/* 
Abstarct class are defined with abstract keyword before the class name 
eg: abstract class SampleAC
and here abstarct class implementing Laptop interface and providing implementation for 2 methods 
and implementation not provided methods are defined with abstarct keyword in the method signature
(it is not mandatory if want we can skip writting it )

*/