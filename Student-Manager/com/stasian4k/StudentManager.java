package com.stasian4k;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(int id){
        for(int i = 0;i < students.size();i++){
            if(students.get(i).getId() == id){
                students.remove(i);
                break;
            }
        }
    }

    public Student findById(int id){
        for(Student student : students){
            if(student.getId() == id){
                return student;
            }
        }
        return null;
    }

    public List<Student> findByName(String name){
        List<Student> result = new ArrayList<>();
        for(Student student : students){
            if(student.getFirstName().equals(name) || student.getLastName().equals(name)){
                result.add(student);
            }
        }
        return result;
    }

    public List<Student> getAllStudents(){
        return students;
    }
}
