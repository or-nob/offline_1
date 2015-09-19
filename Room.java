/**
 * Created by user on 9/19/2015.
 */
public class Room {
    private String hallName;
    private int roomNo;
    private boolean status;
    public Room(){
        //
    }
    public Room(String hall, int no){
        this.hallName = hall;
        this.roomNo = no;
        this.status = false;
    }
    public String getHallName(){
        return this.hallName;
    }
    public void setHallName(String hall){
        this.hallName = hall;
    }
    public int getRoomNo(){
        return this.roomNo;
    }
    public void setRoomNo(int no){
        this.roomNo = no;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean state){
        this.status = state;
    }
    public void print(){
        if(getStatus()==true){
            System.out.println("Room No, "+getRoomNo()+" of "+getHallName()+" Hall is currently alloted.");
        } else {
            System.out.println("Room No, " + getRoomNo() + " of " + getHallName() + " Hall is currently available for allotment.");
        }
    }
}
