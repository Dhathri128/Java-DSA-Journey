package Inheritance;



class Animal{
    Animal(){
        System.out.println("This is Animal");
    }
    
}

class Dog extends Animal{
    Dog(){
        System.out.println("This is Dog class");
    }
}

class Cat extends Animal{
    Cat(){
        System.out.println("This is Cat calss");
    }
}

class Hybrid{

	public static void main (String[] args) {
	    Dog d = new Dog();
	    Cat c = new Cat();
	}
	
}

//This is a simple example of hybrid inheritance in Java.
//From a base class, two derived classes are created.
//if one sub class object is created the constructor of the base class is called and then the constructor of the sub class is called
//and same for the other sub class object creation also the constructor of the base class is called and then the constructor of the sub class is called
