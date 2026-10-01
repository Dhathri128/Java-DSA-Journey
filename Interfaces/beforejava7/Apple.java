package Interfaces.beforejava7;

public class Apple implements Laptop {
    public void copy(){
        System.out.println("Appple copy code");
    }

    public void paste(){
        System.out.println("Apple Paste code");
    }

    public void cut(){
        System.out.println("Apple cut code");
    }

    public void Keyboard(){
        System.out.println("Apple keyboard related functionality");
    }

    public void capture(){
        System.out.println("Apple capture code");
    }
    
}


/* 
Apple is the class that implements the Laptop interface and it has implemented body for all the methods (abstarct methods) declared in the 
interface Laptop and implemented another method capture() regardless of the interface Laptop
 */