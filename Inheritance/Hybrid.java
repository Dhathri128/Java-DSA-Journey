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
