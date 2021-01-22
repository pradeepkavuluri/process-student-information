package com.javatranining.postgresql.curd.processstudentsinformation.controller;

import com.javatranining.postgresql.curd.processstudentsinformation.model.Student;
import com.javatranining.postgresql.curd.processstudentsinformation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(path="/getStudentsInfo")
    public List<Student> getStudentsList(){
        return studentService.getStudentsList();
    }
}
