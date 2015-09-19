/**
 * Created by user on 9/19/2015.
 */
public class Student {
    private String studentName;
    private String studentNo;
    private Room room;
    public Student(){
        //do noting
    }
    public Student(String name, String no, Room r) {
        this.studentName = name;
        this.studentNo = no;
        this.room = r;
    }
    public String getStudentName() {
        return this.studentName;
    }
    public void setStudentName(String name){
        this.studentName = name;
    }
    public String getStudentNo() {
        return this.studentNo;
    }
    public void setStudentNo(String no){
        this.studentNo = no;
    }
    public Room getRoom() {
        return this.room;
    }
    public void setRoom(Room r){
        this.room = r;
    }
    public void print(){
        System.out.println("Student No: " + getStudentNo() + ", " + getStudentName() + ", resides on " + room.getHallName() + " Hall, Room no, " + room.getRoomNo());
    }
}
