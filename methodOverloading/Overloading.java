

package methodOverloading;

class Calculator{
    public int add(int a, int b){    //int b, int a also throes error 
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }
    public void add(String a, int b){

    }                                             // this is valid in java when comes to order 
    public void add(int b, String a){

    }

}
public class Overloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(5,7));
        System.out.println(obj.add(9,6,8));
        System.out.println( obj.add(2.4, 5.6));
        
        
       
    }
    
}
