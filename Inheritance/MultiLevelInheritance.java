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
