package Inheritance;




class Vehicle{
    Vehicle(){
        System.out.println("This is Vehicle class constructor");
    }
    void VehicleType(){
        System.out.println("This is a Vehicle");
    }
}

interface Fare{
    default void FareInfo(){
        System.out.println("Fare Information present in this");
    }
}

class Car extends Vehicle{
    Car(){
        System.out.println("This is Car calss constructor");
    }
    void carInfo(){
        System.out.println("This is a Car");
    }
}

class Bus extends Vehicle implements Fare{
    void busInfo(){
        System.out.println("This is a Bus");
    }
}

public class Hybrid {
    public static void main (String[] args) 
	{
	    Car c = new Car();
	    c.VehicleType();
	    c.carInfo();
	   // c.FareInfo();
	    
	    Bus b = new Bus();
	    b.VehicleType();
	    b.busInfo();
        b.FareInfo();
	}
    
}

/*AND THE OUTPUT IS :
This is Vehicle class constructor
This is Car calss constructor
This is a Vehicle
This is a Car
This is Vehicle class constructor
This is a Vehicle
This is a Bus
Fare Information present in this
*/