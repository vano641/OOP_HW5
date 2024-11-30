package view;

import java.util.List;
import java.util.Map;

import model.Student;
import model.StudyGroup;
import model.Teacher;

public class StudyGroupView {

// метод печати Учебной группы через Map
    public void printStudyGroup(Map<Teacher, List<Student>> sg){
        for (Map.Entry<Teacher, List<Student>> i : sg.entrySet()) {
            System.out.println("Учитель: " + i.getKey() +"\n" + "Студенты: " + i.getValue());
        }
    }

    public void printTeacher(Map<Teacher, List<Student>> sg){
        for (Map.Entry<Teacher, List<Student>> i : sg.entrySet()) {
            System.out.println("Учитель: " + i.getKey());
        }
    }

    public void printStudents(Map<Teacher, List<Student>> sg){
        for (Map.Entry<Teacher, List<Student>> i : sg.entrySet()) {
            System.out.println("Студенты: " + i.getValue());
        }
    }

// Метод печати Учебной группы через Список
    public void printStudyGroup2(List<StudyGroup> sg){
        for (StudyGroup i : sg) {
            System.out.println(i);
        }
    }


}
