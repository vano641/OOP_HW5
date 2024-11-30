package controller;

import java.util.List;
import java.util.Map;

import model.Student;
import model.StudyGroup;
import model.Teacher;
import service.StudyGroupService;
import view.StudyGroupView;

public class Controller {
    

    private StudyGroupService SGService = new StudyGroupService();
    private StudyGroupView  SGView = new StudyGroupView();
    private Map<Teacher, List<Student>> SG;
    private List<StudyGroup> SG2;

// Создадим учебную группу
    public Controller() {
        this.SG = SGService.createStudyGroup();
        this.SG2 = SGService.createStudyGroup2();
    }
// Печать Учебной группы через Map
    public void PrintSG(){
        SGView.printStudyGroup(SG);
    }
// Печать Учителя
    public void printTeacher(){
        SGView.printTeacher(SG);
    }
// Печать Студентов
    public void printStudents(){
        SGView.printStudents(SG);
    }
// Печать учебной группы через Список
    public void PrintSG2(){
        SGView.printStudyGroup2(SG2);
    }
    

}
