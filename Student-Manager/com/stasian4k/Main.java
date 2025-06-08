package com.stasian4k;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args){
        StudentManager manager = new StudentManager();

        manager.addStudent(new Student(1,"Stas","Liakin","B6", LocalDate.of(2024,9,23)));
        manager.addStudent(new Student(2,"Maks","Grichanuk","A6",LocalDate.of(2024,9,23)));

        Student found = manager.findById(1);
        System.out.println(found);

        List<Student> StasStudents = manager.findByName("Stas");
        System.out.println(StasStudents);

        manager.removeStudent(1);
        System.out.println("deleting student 1");
        System.out.println("Student with number 1 = " + manager.findById(1));

    }
}
