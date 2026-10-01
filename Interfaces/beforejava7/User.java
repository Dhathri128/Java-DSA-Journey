package Interfaces.beforejava7;

public class User {
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        lenovo.copy();
        lenovo.cut();
        lenovo.paste();

        Apple ap = new Apple();
        ap.capture();
        ap.copy();
        ap.Keyboard();

        Hp hp = new Hp();
        hp.Keyboard();
        hp.print();
        hp.copy();
        hp.cut();

    }
}
