
package Stack;

public class MyStack {

    int[] arr;
    int capacity;
    int top;

    MyStack(int size) {
        capacity = size;
        arr = new int[size];
        top = -1;
    }

    void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = value;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return arr[top--];
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return arr[top];
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
