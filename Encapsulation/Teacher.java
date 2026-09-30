package Encapsulation;

public class Teacher {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("HAI");
        System.out.println(s1.getName());

        s1.setNoOfStudents(45);
        System.out.println(s1.getNoOfStudents());
    }
}
