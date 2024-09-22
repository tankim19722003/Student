package com.example.demo;

import java.util.ArrayList;

public class StudentDao {
    private static ArrayList<Student> students = new ArrayList<>();

    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    public Student updateStudent(Student newStudent) {

        for (Student student : students) {
            if (student.getId() == newStudent.getId()) {
                student.setAge(newStudent.getAge());
                student.setFullname(newStudent.getFullname());
            }
        }
        return newStudent;
    }

    public void deleteStudent(int studentId) {

        // traverse to find student
        for (Student student : students) {
            if (student.getId() == studentId) {
                students.remove(student);
                break;
            }
        }
    }

    public ArrayList<Student> findAllStudents() {
        return students;
    }
}
