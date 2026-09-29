package Inheritance;



class Vehicle{
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
    void carInfo(){
        System.out.println("This is a Car");
    }
}

/* 
class Car extends Vehicle implements Fare{
    void carInfo(){
        System.out.println("This is a Car");
    }
}
*/

class Bus extends Vehicle implements Fare{
    void busInfo(){
        System.out.println("This is a Bus");
    }
}



class HybridInterface
{
	public static void main (String[] args) 
	{
	    Car c = new Car();
	    c.VehicleType();
	    c.carInfo();
	   // c.FareInfo(); this can,t be called if called also throws compilation error because
                   // Car class is not implementing the interface 
                    // bus class is implemting the Fare interface as well as extending the 
                    //Vehicle (Super class) so with bus object methods in both the super class and interface can be called
                    //whereas Car class can only call the methods of the super class and its methods because it is not implementing the interface
        
	    
	    Bus b = new Bus();
	    b.VehicleType();
	    b.busInfo();
        b.FareInfo();
	}
}


/* 
OUTPUT WITHOUT COMMENTING THE CAR CLASS IMPLEMENTING FARE INTERFACE
This is a Vehicle
This is a Car
Fare Information present in this
This is a Vehicle
This is a Bus
Fare Information present in thiS

OUTPUT WITH COMMENTING THE CAR CLASS IMPLEMENTING FARE INTERFACE
This is a Vehicle
This is a Car
This is a Vehicle
This is a Bus
Fare Information present in this
 */