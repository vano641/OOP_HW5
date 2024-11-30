package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Student;
import model.StudyGroup;
import model.Teacher;

public class StudyGroupService {
    
    public Map<Teacher, List<Student>> studugroup;
    public List<StudyGroup> studentgroup2;

// метод инициализации Учебной Группы через Map (чтобы иметь возможность отдельно печатать Ключ:Учитель и Значение:Список Студентов): 
    public Map<Teacher, List<Student>> createStudyGroup(){
        Map<Teacher, List<Student>> result = new HashMap<>();

        Teacher teacher = new Teacher("Елена", "Вадимовна", "Мысовская", 1);
        
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student("Иван", "Иванов", "Иванович", 1));
        listStudent.add(new Student("Кристина", "Петрова", "Петровна", 2));
        listStudent.add(new Student("Артем", "Артемов", "Артемович", 3));
        
        result.put(teacher, listStudent);
        return result;
    }
// метод инициализации Учебной группы через Список
    public List<StudyGroup> createStudyGroup2(){
        List<StudyGroup> result = new ArrayList<>();
        Teacher teacher = new Teacher("Кристина", "Вячеславовна", "Кусакина", 2);
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student("Семен", "Семенов", "Семенович", 4));
        listStudent.add(new Student("Ольга", "Ольгова", "Олеговна", 5));
        listStudent.add(new Student("Юрий", "Юрьев", "Юрьевич", 6));
        result.add(new StudyGroup(teacher, listStudent));
        return result;
    }


// метод возврата Учебной Группы:
    public Map<Teacher, List<Student>> getStudyGroup() {
        return studugroup;
    }

}

