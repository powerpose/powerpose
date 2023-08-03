package com.example.powerPoseTest.jungyeol.service;

import java.util.List;

import com.example.powerPoseTest.jungyeol.model.Student;

public interface IStudentService {
    int getStuCount();
    List<Student> getStuList();
    Student getStuInfo(int stuNumber);
    void updateStu(Student student);
    void insertStu(Student student);
    void deleteStu(int stuNumber);
}
