package Encapsulation;

public class EncapsulationEx {

    public static void main(String[] args) {

        StudentEx s = new StudentEx();

        s.setName("Dhathri");
        s.setAge(21);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
