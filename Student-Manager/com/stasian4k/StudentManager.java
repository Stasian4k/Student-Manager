package com.stasian4k;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();
    private List<Essay> essays = new ArrayList<>();

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

    public void addEssay(Essay essay) {
        essays.add(essay);
    }

    public void removeEssay(int id) {
        for (int i = 0; i < essays.size(); i++) {
            if (essays.get(i).getId() == id) {
                essays.remove(i);
                break;
            }
        }
    }

    public Essay findEssayById(int id) {
        for (Essay essay : essays) {
            if (essay.getId() == id) {
                return essay;
            }
        }
        return null;
    }

    public List<Essay> findEssaysByStudentId(int studentId) {
        List<Essay> result = new ArrayList<>();
        for (Essay essay : essays) {
            if (essay.getStudentId() == studentId) {
                result.add(essay);
            }
        }
        return result;
    }

    public List<Essay> getAllEssays() {
        return essays;
    }
}
