package model;

public class Teacher extends User {
    
    protected int teacherId;

    public Teacher(String firstName, String lastName, String middleName, int teacherId) {
        super(firstName, lastName, middleName);
        this.teacherId = teacherId;
    }


    public int getTeacherId() {
        return this.teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s id:%d", firstName, lastName, middleName, teacherId);
    }
}
