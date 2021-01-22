package com.javatranining.postgresql.curd.processstudentsinformation.model;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long id;

    @Column(name="student_name")
    public String studentName;

    @Column(name="student_course")
    public String studentCourse;

    @Column(name="student_stream")
    public String studentStream;

}
