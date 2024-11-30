package model;

import java.util.List;

public class StudyGroup {
    
    private Teacher teacher;
    private List<Student> listStudent;


    public StudyGroup(Teacher teacher, List<Student> listStudent) {
        this.teacher = teacher;
        this.listStudent = listStudent;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getListStudent() {
        return this.listStudent;
    }

    public void setListStudent(List<Student> listStudent) {
        this.listStudent = listStudent;
    }

    @Override
    public String toString() {
        return String.format("Учитель: %s\nСписок студентов:\n%s", teacher, listStudent);
    }
}
