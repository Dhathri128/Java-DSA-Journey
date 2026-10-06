package MethodOverriding.OverridingInterface;


interface Vehicle {

    void start();
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car starts");
    }
}

class Bike implements Vehicle {

    public void start() {
        System.out.println("Bike starts");
    }
}

public class Main {

    public static void main(String[] args) {

        Vehicle v;

        v = new Car(); //Car c = new Car(); c.start();
        v.start();     
  
        v = new Bike();  // this 2 lines is written as   Bike b = new Bike();
        v.start();       //                              b.start();            same to above car
    }
}

//javac MethodOverriding/OverridingInterface/Main.java 