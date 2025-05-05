package com.edu.StudentsManagementSystem.controller;

import com.edu.StudentsManagementSystem.model.Student;
import com.edu.StudentsManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public String addStudent(@RequestBody Student student) {
    	System.out.println("this is add student ");
        studentService.addStudent(student);
        return "Student added successfully";
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }
}