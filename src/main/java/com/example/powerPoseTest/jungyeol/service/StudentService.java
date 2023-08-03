package com.example.powerposetest.jungyeol.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.powerposetest.jungyeol.dao.IStudentRepository;
import com.example.powerposetest.jungyeol.model.Student;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentRepository stuDao;

    @Override
    public int getStuCount() {
        return stuDao.getStuCount();
    }

    @Override
    public List<Student> getStuList() {
        return stuDao.getStuList();
    }

    @Override
    public Student getStuInfo(int stuNumber) {
        return stuDao.getStuInfo(stuNumber);
    }

    @Override
    public void updateStu(Student stu) {
        stuDao.updateStu(stu);
    }

    @Override
    public void insertStu(Student stu) {
        stuDao.insertStu(stu);
    }

    @Override
    public void deleteStu(int stuNumber) {
        stuDao.deleteStu(stuNumber);
    }
}
