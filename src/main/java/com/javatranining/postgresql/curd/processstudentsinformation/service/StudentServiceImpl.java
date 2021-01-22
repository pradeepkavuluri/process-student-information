package com.javatranining.postgresql.curd.processstudentsinformation.service;

import com.javatranining.postgresql.curd.processstudentsinformation.model.Student;
import com.javatranining.postgresql.curd.processstudentsinformation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getStudentsList() {
        return studentRepository.findAll();
    }

    @Override
    public Student newStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void removeStudent(Long id) {
         studentRepository.deleteById(id);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }
}
