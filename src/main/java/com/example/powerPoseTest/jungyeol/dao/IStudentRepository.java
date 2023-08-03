// IStudentRepository.java
package com.example.powerPoseTest.jungyeol.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.powerPoseTest.jungyeol.model.Student;

@Repository
@Mapper
public interface IStudentRepository {
    int getStuCount();
    List<Student> getStuList();
    Student getStuInfo(int stuNumber);
    void updateStu(Student student);
    void insertStu(Student student);
    void deleteStu(int stuNumber);
}
