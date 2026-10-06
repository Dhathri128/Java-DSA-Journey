package MethodOverriding.OverridingInheritance;


class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog sounds");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat sounds");
    }
}

public class Main {
    public static void main(String[] args) {
        //Dog d = new Dog();  same as below 
         Animal d = new Dog();
        d.sound();
        Cat c = new Cat();
        c.sound();
    }
    
}


// to compile --- javac MethodOverriding/OverridingInheritance/Main.java