package Encapsulation;

class Student1{
    private int RollNo;
    private String Name;
    private boolean isAttended;
    
    public Student1(int RollNo){
        this.RollNo = RollNo;
        
    }
    
    public void setStudentAttendance(boolean flag){
        if(!isAttended){
            isAttended = flag;
        }
        System.out.println("Teacher assigned attendance to Student");
    }
    
    public boolean getStudentAttendance(){
        System.out.println("Teacher Accessed Student Attendance");
        return isAttended;
    }
}