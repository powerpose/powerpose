package com.example.powerPoseTest.jungyeol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.powerPoseTest.jungyeol.model.Student;
import com.example.powerPoseTest.jungyeol.service.IStudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("/list")
    public String getStuList(Model model) {
        List<Student> student = studentService.getStuList();
        model.addAttribute("student", student);
        return "student/list";
    }

    @GetMapping("/{stuNumber}")
    public String getStuInfo(@PathVariable int stuNumber, Model model) {
        Student student = studentService.getStuInfo(stuNumber);
        model.addAttribute("student", student);
        return "student/info";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        return "student/form";
    }

    @PostMapping("/add")
    public String addStudent(@ModelAttribute Student student) {
        studentService.insertStu(student);
        return "redirect:/student/list";
    }

    @GetMapping("/edit/{stuNumber}")
    public String showEditForm(@PathVariable int stuNumber, Model model) {
        Student student = studentService.getStuInfo(stuNumber);
        model.addAttribute("student", student);
        return "student/form";
    }

    @PostMapping("/edit")
    public String editStudent(@ModelAttribute Student student) {
        studentService.updateStu(student);
        return "redirect:/student/list";
    }

    @GetMapping("/delete/{stuNumber}")
    public String deleteStudent(@PathVariable int stuNumber) {
        studentService.deleteStu(stuNumber);
        return "redirect:/student/list";
    }
}
