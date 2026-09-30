
package Encapsulation;
class StudentEx {

    // Private data members
    private String name;
    private int age;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}