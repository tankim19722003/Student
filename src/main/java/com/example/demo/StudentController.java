package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    StudentDao studentDao = new StudentDao();

    @GetMapping("/{studentId}")
    public ResponseEntity<Student> getStudentById(
            @PathVariable("studentId") int id
    ) {
        Student student = new Student();
        student.setAge(21);
        student.setFullname("Trần Thị Ngọc Giàu");
        student.setId(1);
        return ResponseEntity.ok().body(student);
    }

    @PutMapping()
    public ResponseEntity<Student> updateStudent(
            @RequestBody Student student
    ) {
        return ResponseEntity.ok().body(studentDao.updateStudent(student));
    }

    @GetMapping()
    public ResponseEntity<ArrayList<Student>> findAllStudents() {
        return ResponseEntity.ok().body(studentDao.findAllStudents());
    }

    @DeleteMapping("{studentId}")
    public void deleteStudent(
            @PathVariable("studentId") int studentId
    ) {
        studentDao.deleteStudent(studentId);
    }

    @PostMapping()
    public Student addStudent(
            @RequestBody Student student
    ) {
        return studentDao.addStudent(student);
    }
}
