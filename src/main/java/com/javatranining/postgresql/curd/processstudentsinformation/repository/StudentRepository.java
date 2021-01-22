package com.javatranining.postgresql.curd.processstudentsinformation.repository;

import com.javatranining.postgresql.curd.processstudentsinformation.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
