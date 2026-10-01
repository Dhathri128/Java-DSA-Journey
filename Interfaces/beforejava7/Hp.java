package Interfaces.beforejava7;

public class Hp implements Laptop {
    // public void copy(); This method requires a body instead of a semicolon as this abstarct needs implementation
        //System.out.println("HP copy code");   evwn i comment it and called method from the amin class User it is not printiing 
                                               //anything or not throwing any error  (since the method is there with { } as empty)
                                                                                      //if is not there it may thow error 
    
    public void copy(){
        System.out.println("HP copy code");
    }
    public void paste(){
        System.out.println("HP Paste code");
    }

    public void cut(){
        System.out.println("HP cut code");
    }

    public void Keyboard(){
        System.out.println("keyboard related functionality");
    }

    public void print(){
        System.out.println("print related code");
    }
    
}

