
package Inheritance;
 interface WaterVehicle{
        default void WaterInfo(){
            System.out.println("This is a Water Vehicle");
        }
    }
    
    interface LandVehicle{
        default void LandInfo(){
            System.out.println("This ia a Land Vehicle");
        }
    }
    
    class Amphibious implements WaterVehicle, LandVehicle{
        Amphibious(){
            System.out.println("This is Amphibious class");
        }
    }
    
    class MultipleInterface{
 
	public static void main (String[] args) 
	{
       Amphibious obj = new Amphibious();
       obj.WaterInfo();
       obj.LandInfo();
	}
   }

    