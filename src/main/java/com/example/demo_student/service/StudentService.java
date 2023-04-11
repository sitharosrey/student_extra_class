package com.example.demo_student.service;

import com.example.demo_student.model.entity.Student;
import com.example.demo_student.model.request.StudentRequest;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student addNewStudent(StudentRequest studentRequest);
}
