package com.stasian4k;
import java.time.LocalDate;

public class Student {
        private final int id;
        private final String firstName;
        private final String lastName;
        private String group;
        private LocalDate dataOfBecoming;

        public Student(int id,String firstName,String lastName,String group,LocalDate dataOfBecoming){
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.group = group;
            this.dataOfBecoming = dataOfBecoming;
        }

        public int getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName(){
            return lastName;
        }

        public String getGroup() {
            return group;
        }

        public LocalDate getDataOfBecoming() {
            return dataOfBecoming;
        }

        public void setGroup(String group){
            this.group = group;
        }

        public void setDataOfBecoming(LocalDate dataOfBecoming){
            this.dataOfBecoming = dataOfBecoming;
        }

        @Override
        public String toString(){
            return  "Student{" +
                    "id=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", group='" + group + '\'' +
                    ", dataOfBecoming='" + dataOfBecoming + '\'' +
                    '}';
        }

}
