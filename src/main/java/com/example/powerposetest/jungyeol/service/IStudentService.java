package com.example.powerposetest.jungyeol.service;

import java.util.List;

import com.example.powerposetest.jungyeol.model.Student;

public interface IStudentService {
    int getStuCount();
    List<Student> getStuList();
    Student getStuInfo(int stuNumber);
    void updateStu(Student student);
    void insertStu(Student student);
    void deleteStu(int stuNumber);
}
