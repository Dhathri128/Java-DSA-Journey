
package Stack;

public class implementation {

    public static void main(String[] args) {

        MyStack stack = new MyStack(5);

        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Removed: " + stack.pop());

        System.out.println("Top: " + stack.peek());

        System.out.println("Stack elements:");
        stack.display();

    }
}
