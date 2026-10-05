package AbstractClass;

public abstract class SampleAC implements Laptop{
    public void copy(){
        System.out.println("This is copy code");
    }

    public void paste(){
        System.out.println("This is paste code");
    }
    
    abstract public void cut();

    abstract public void keyboard();
}
