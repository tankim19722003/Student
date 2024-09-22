package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

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
}
