package com.example.powerPoseTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JungahController {
	@Autowired
	IJungahService jungahService;
	
	@RequestMapping("/")
	public String selectAll(Model model) {
		List<Jj> jjs =jjService.selectAllJj();
		model.addAttribute("Jj", jjs);
		return "home";
	}
}
