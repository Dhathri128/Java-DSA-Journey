

package Encapsulation;

class Student{
    private String Name;

    private int NoOfStudents;

    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public int getNoOfStudents(){
        return NoOfStudents;
    }

    public void setNoOfStudents(int countofstudents){
        this.NoOfStudents = countofstudents;
    }
}
