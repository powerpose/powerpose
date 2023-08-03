package com.example.powerposetest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.powerposetest.notice.model.Notice;
import com.example.powerposetest.notice.service.INoticeService;

@Controller
public class NoticeController {

	@Autowired
	INoticeService noticeService;

	@RequestMapping("/")
	public String selectNoticeList(Model model) {
		List<Notice> noticeList = noticeService.selectNoticeList();
		model.addAttribute("List", noticeList);
		return "list";
	}

	@RequestMapping(value="/insert", method=RequestMethod.GET)
	public String insertNotice() {
		return "insert";
	}

	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public String insertNotice(Notice notice) {
		noticeService.insertNotice(notice);
		return "redirect:/";
	}


	@RequestMapping(value="/update/{noticeId}", method=RequestMethod.GET)
	public String updateNotice(@PathVariable int noticeId, Model model) {
		Notice notice = noticeService.selectNotice(noticeId);
		model.addAttribute("notice", notice);
		return "update";
	}

	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String updateNotice(Notice notice, RedirectAttributes redirectAttrs) {
		notice.setTitle(notice.getTitle());
		notice.setContent(notice.getContent());
		noticeService.updtaeNotice(notice);
		return "redirect:/";

	}

	@RequestMapping(value="/delete/{noticeId}", method=RequestMethod.GET)
	public String deleteNotice(@PathVariable int noticeId) {
		System.out.println("noticeId:" + noticeId);
		noticeService.deleteNotice(noticeId);
		return "redirect:/";
	}
}
