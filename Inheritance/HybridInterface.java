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
	   // c.FareInfo();
	    
	    Bus b = new Bus();
	    b.VehicleType();
	    b.busInfo();
        b.FareInfo();
	}
}

