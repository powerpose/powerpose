package com.example.powerPoseTest.jungah.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.powerPoseTest.jungah.model.Jj;
import com.example.powerPoseTest.jungah.service.IJjService;

@Controller
public class JjController {
	 @Autowired
	   IJjService jjService;
	  
	   @GetMapping("/home")
	   public String home(Model model) {
	       // 데이터 로드 및 모델 설정
	       return "home";
	   }

	   @RequestMapping("/")
	   public String selectAllJj(Model model) {
	       List<Jj> jjs = jjService.selectAllJj();
	       model.addAttribute("Jj", jjs);
	       return "home";
	   }

	   @GetMapping("/insert")
	   public String insertJj() {
	       return "jj/insert";
	   }

	   @PostMapping("jj/insert")
	   public String insertJj(@RequestParam String title, @RequestParam String context) {
	       jjService.insertJj(title, context);
	       return "redirect:/";
	   }
	   
		  @GetMapping("/view/{id}")
		  public String view(@PathVariable("id") int id,Model model) {
			  Jj jj = (Jj) jjService.view(id); 
			  model.addAttribute("jj", jj);
		  return "jj/view";
		  }
		  
		  @GetMapping("/update/{id}")
		    public String updateJj(@PathVariable("id") int id, Model model) {
		        Jj jj = (Jj) jjService.view(id);
		        model.addAttribute("jj", jj);
		        return "jj/update";
		    }

		    @PostMapping("/update")
		    public String updateJj(@RequestParam("id") int id, @RequestParam("title") String title, @RequestParam("context") String context) {
		        System.out.println("kjjjjj");
		        jjService.updateJj(id, title, context);
		        return "redirect:/";
		    }
		    
		    @RequestMapping(value="/delete/{id}", method=RequestMethod.POST)
		    public String delete(@PathVariable("id") int id, Model model) {
		        jjService.delete(id);
	System.out.println("테스트"+id);
		        return "redirect:/";
		    }
	   
	  
	 
	   

	   
	}