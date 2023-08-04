package com.example.powerposetest.jungyeol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.powerposetest.jungyeol.model.Student;
import com.example.powerposetest.jungyeol.service.IStudentService;

@Controller
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping(value = "/student/list", method = RequestMethod.GET)
    public String getStuList(Model model) {
        List<Student> student = studentService.getStuList();
        model.addAttribute("student", student);
        return "student/list";
    }

    @RequestMapping(value = "/student/{stuNumber}", method = RequestMethod.GET)
    public String getStuInfo(@PathVariable int stuNumber, Model model) {
        Student student = studentService.getStuInfo(stuNumber);
        model.addAttribute("student", student);
        return "student/info";
    }

    @RequestMapping(value = "/student/add", method = RequestMethod.GET)
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        return "student/form";
    }

    @RequestMapping(value = "/student/add", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute Student student) {
        studentService.insertStu(student);
        return "redirect:/student/list";
    }

    @RequestMapping(value = "/student/edit/{stuNumber}", method = RequestMethod.GET)
    public String showEditForm(@PathVariable int stuNumber, Model model) {
        Student student = studentService.getStuInfo(stuNumber);
        model.addAttribute("student", student);
        return "student/form";
    }

    @RequestMapping(value = "/student/edit", method = RequestMethod.POST)
    public String editStudent(@ModelAttribute Student student) {
        studentService.updateStu(student);
        return "redirect:/student/list";
    }

    @RequestMapping(value = "/student/delete/{stuNumber}", method = RequestMethod.GET)
    public String deleteStudent(@PathVariable int stuNumber) {
        studentService.deleteStu(stuNumber);
        return "redirect:/student/list";
    }
}
