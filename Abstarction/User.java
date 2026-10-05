package Abstarction;


public class User {
    public static void main(String[] args) {
        Laptop lenovo = new Lenovo();
        lenovo.copy();
        lenovo.cut();

        Apple ap = new Apple();
        ap.capture();
        ap.copy();
        ap.paste();
    }
}