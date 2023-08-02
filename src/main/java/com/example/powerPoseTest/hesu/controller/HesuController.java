package com.example.powerPoseTest.hesu.controller;

import com.example.powerPoseTest.hesu.model.Hesu;
import com.example.powerPoseTest.hesu.service.HesuService;
import com.example.powerPoseTest.hesu.service.IHesuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/hesu")
public class HesuController {
    @Autowired
    IHesuService hesuService;

    @GetMapping("/list")
    public String getAllHesu(Model model) {
        List<Hesu> hesu = hesuService.getAllHesu();
        model.addAttribute("hesu", hesu);
        return "hesu/hesu";
    }

    @GetMapping("/insert")
    public String setHesu() {
        return "hesu/insert";
    }

    @PostMapping("/insert")
    public String insertHesu(@RequestParam String title, @RequestParam String context) {
        hesuService.insertHesu(title, context);
        return "hesu/hesu";
    }

    @GetMapping("/detail")
    public String setHesu(@RequestParam("id") int id, Model model) {
        Hesu hesu = (Hesu) hesuService.getAHesu(id);
        model.addAttribute("hesu", hesu);
        return "hesu/detail";
    }

    @GetMapping("/update")
    public String updateHesu(@RequestParam("id") int id, Model model) {
        Hesu hesu = (Hesu) hesuService.getAHesu(id);
        model.addAttribute("hesu", hesu);
        return "hesu/update";
    }

    @PostMapping("/update")
    public String updateHesu(@RequestParam("id") int id, @RequestParam("title") String title, @RequestParam("context") String context) {
        System.out.println("ddddddd");
        hesuService.updateHesu(id, title, context);
        return "redirect:/hesu/list";
    }
    @GetMapping("/delete")
    public String deleteHesu(@RequestParam("id") int id, Model model) {
        hesuService.deleteHesu(id);

        return "redirect:/hesu/list";
    }
}
