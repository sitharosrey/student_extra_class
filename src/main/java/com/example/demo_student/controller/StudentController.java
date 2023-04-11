package com.example.demo_student.controller;

import com.example.demo_student.model.entity.Student;
import com.example.demo_student.model.request.StudentRequest;
import com.example.demo_student.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/student")
    public Student addNewStudent(
            @RequestBody StudentRequest studentRequest
    ) {
        Student student = studentService.addNewStudent(studentRequest);
        return student;
    }
}
