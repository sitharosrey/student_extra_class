package com.example.demo_student.repository;

import com.example.demo_student.model.entity.Student;
import com.example.demo_student.model.request.StudentRequest;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentRepository {

    @Select("""
            SELECT * FROM student_tb
            """)
    @Results(id = "studentMap", value = {
            @Result(property = "studentId", column = "id"),
            @Result(property = "studentName", column = "name"),
    })
    List<Student> getAllStudents();

    @Select("""
            INSERT INTO student_tb(name, major)
            VALUES(#{student.studentName}, #{student.major})
            RETURNING *
            """)
    @ResultMap("studentMap")
    Student addNewStudent(@Param("student") StudentRequest studentRequest);
}
