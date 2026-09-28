package Inheritance;


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

class puppy extends Dog{
    puppy(){
        System.out.println("This puppy is a dog");
    }
    void bow(){
        System.out.println("puppy makes bow bow");
    }
}




public class MultiLevelInheritance {
    public static void main (String[] args) 
	{
	Dog d = new Dog();
	d.bark();
	puppy p = new puppy();
	d.bark();
	p.bow();

	}
}



/*
 This is a simple example of multi-level inheritance in Java.
 The 'puppy' class inherits from the 'Dog' class, which in turn inherits from the 'Animal' class.

 see this mult-level inheritance in which one class is derived from another dervied class na.
i have created object for the dog class so the constructors of the Animal class and Dog class is called this is ok 
and the methods will be called if we call them using the particular class object 
coming to my doubt : when object is created fot the 2nd derived class is the super class constructor also called .... 
i.e here i have crested object for the puppy class which is dervied from the dog class 
 thenii think only the   dog and puppy class constructors are called  
 but in the output the Animal constructor also printend means it is also going to be called or what even we call the puppy 
 */