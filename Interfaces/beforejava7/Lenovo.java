package Interfaces.beforejava7;

public class Lenovo implements Laptop {
    public void copy(){
        System.out.println("Lenovo copy code");
    }

    public void paste(){
        System.out.println("Lenovo Paste code");
    }

    public void cut(){
        System.out.println("Lenovo cut code");
    }

    public void Keyboard(){
        System.out.println("Lenovo keyboard related functionality");
    }
    
}


/* 
Lenovo is the class that implements the Laptop interface and it has implemented body for all the methods (abstarct methods) declared in the 
interface Laptop
 */ 