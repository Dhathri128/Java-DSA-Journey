package Stack;

public class Stack {

    int[] arr;
    int capacity;
    int top;

    Stack(int size){
        capacity = size;
        arr = new int[size];
        int top = -1;
    }

    void push(int value){
        if(top == capacity){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top];
    }
    

    void pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return;
        }
        return arr[top--];
    }

    void peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    void display(){
        for(int i = top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
