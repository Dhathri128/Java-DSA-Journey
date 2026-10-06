

package methodOverloading;

class Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
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
