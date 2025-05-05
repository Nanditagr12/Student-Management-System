package com.edu.StudentsManagementSystem.service;

import com.edu.StudentsManagementSystem.dao.StudentDAO;
import com.edu.StudentsManagementSystem.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;

    public int addStudent(Student student) {
        return studentDAO.save(student);
    }

    public List<Student> getAllStudents() {
        return studentDAO.findAll();
    }
}