package Interfaces.beforejava7;

public interface Laptop {
public void copy();

public void paste();

public void cut();

public void Keyboard();
    
} 
 

/*
interface looks like class only the only difference it in class "class"keyword is there wheras in interfaces "interface"keyword before their names
Laptop is the interface here so all the classes implenting it need to use the keyword "implements" after the class name 
   like   "classname implements interface name"   ----->  Lenovo implements Laptop  and Hp implements Laptop
All the classes that imaplements the interface must provide implementatin fro all the methods 
   else it will show errro like ""The type Hp must implement the inherited abstract method Laptop.copy()"""
Abstarct method is the method that is present in the interface with no implementation of body only the method declaration is there 
    like public void copy(); and public void paste();
The implemented methods can also have or include extra methods rather than the abstract methods 


*/