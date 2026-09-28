package Inheritance;

import java.util.*; 

class Animal{
    Animal(){
        System.out.println("This is Animal");
        int a = 10;
    }
    
}
class Dog extends Animal{
    Dog(){
        System.out.println("This Animal is Dog");
    }
    void bark(){
        System.out.println("Dogs bark");
    }
   
}

class SingleInheritance
{
	public static void main (String[] args) 
	{
	Dog d = new Dog();
	d.bark();
	

	}
}