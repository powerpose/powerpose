package com.example.powerPoseTest.jungah.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.powerPoseTest.jungah.model.Jungah;
import com.example.powerPoseTest.jungah.service.IJungahService;
import com.example.powerPoseTest.jungah.service.JungahService;

@Controller
@RequestMapping("/jungah")
public class JungahController {
    @Autowired
    IJungahService jungahService;

    @GetMapping("/list")
    public String getAllHesu(Model model) {
        List<Jungah> jungah = jungahService.getAllJungah();
        model.addAttribute("jungah", jungah);
        return "jungah/jungah";
    }

    @GetMapping("/insert")
    public String setJungah() {
        return "Jungah/insert";
    }

    @PostMapping("/insert")
    public String insertJungah(@RequestParam String title, @RequestParam String context) {
        jungahService.insertJungah(title, context);
        return "jungah/jungah";
    }

    @GetMapping("/detail")
    public String setJungah(@RequestParam("id") int id, Model model) {
        Jungah jungah = (Jungah) jungahService.getAJungah(id);
        model.addAttribute("jungah", jungah);
        return "jungah/detail";
    }

    @GetMapping("/update")
    public String updateJungah(@RequestParam("id") int id, Model model) {
        Jungah jungah = (Jungah) jungahService.getAJungah(id);
        model.addAttribute("jungah", jungah);
        return "jungah/update";
    }

    @PostMapping("/update")
    public String updateJungah(@RequestParam("id") int id, @RequestParam("title") String title, @RequestParam("context") String context) {
        System.out.println("ddddddd");
        jungahService.updateJungah(id, title, context);
        return "redirect:/jungah/list";
    }
    @GetMapping("/delete")
    public String deleteJungah(@RequestParam("id") int id, Model model) {
    	jungahService.deleteJungah(id);

        return "redirect:/jungah/list";
    }
}
