package Inheritance;



public class Multi{
	public static void main(String[] args) {
        FourWheeler obj1 = new FourWheeler();
        Car obj = new Car(); // Triggers all constructors in order
      
    }
}

class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}
class FourWheeler extends Vehicle {
    FourWheeler() {
        System.out.println("4 Wheeler Vehicles");
    }
}
class Car extends FourWheeler {
    Car() {
        System.out.println("This 4 Wheeler Vehicle is a Car");
    }
}
