package Inheritance;



class Vehicle{
    Vehicle(){
        System.out.println("This is Vehicle class constructor");
    }
    String brand = "Fortuner";
}

class Car extends Vehicle{
    Car(){
        System.out.println("This is car class constructor");
    }
    void CarInfo(){
        System.out.println(brand);
    }
}

class Single
{
	public static void main (String[] args) 
	{
		Car c = new Car();
		c.CarInfo();

	}
}
