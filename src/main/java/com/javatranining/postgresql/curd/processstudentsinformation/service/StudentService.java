package com.javatranining.postgresql.curd.processstudentsinformation.service;

import com.javatranining.postgresql.curd.processstudentsinformation.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudentsList();
    Student newStudent(Student student);
    boolean removeStudent(Student student);
    Student updateStudent(Student student);

}
