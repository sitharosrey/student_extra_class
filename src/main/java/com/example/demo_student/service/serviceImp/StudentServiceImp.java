package com.example.demo_student.service.serviceImp;

import com.example.demo_student.model.entity.Student;
import com.example.demo_student.model.request.StudentRequest;
import com.example.demo_student.repository.StudentRepository;
import com.example.demo_student.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImp(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    @Override
    public Student addNewStudent(StudentRequest studentRequest) {
        return studentRepository.addNewStudent(studentRequest);
    }
}
