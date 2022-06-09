package com.team.Imitation.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.team.Imitation.repository.dto.MemberDTO;
import com.team.Imitation.service.MemberService;


@Controller
@RequestMapping("member")
public class MemberController {
	
	
	@Autowired
	MemberService ms;
	
	
	@RequestMapping("/register_form")
	public String register_form() {
		return "member/register";
	}
	
	@RequestMapping("/register")
	public String register(MemberDTO member) {
		int result = ms.register(member);
		if(result == 1) {
			return "redirect:login";
		}
		return "redirect:register_form";
	}
	
	@GetMapping("memberInfo")
	public String memberInfo(@RequestParam("email") String email, Model model) {
		ms.memberInfo(email, model);
		return "member/memberInfo";
	}
	
	@GetMapping("modify_form")
	public String modify_form(@RequestParam int id, Model model) {
		ms.contentView(id, model);
		return "member/modify_form";
	}
	
	@PostMapping("modify")
	public void modify(MultipartHttpServletRequest mul, 
						HttpServletRequest request, 
						HttpServletResponse response) throws Exception{
		
		String message = ms.modify(mul, request);
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(message);
	}
	
	@GetMapping("delete")
	public void delete(@RequestParam String email, @RequestParam String imgName, 
						HttpServletRequest request, 
						HttpServletResponse response) throws Exception{
	
		String message = ms.memberDelete(email, imgName, request);
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(message);
		
	}
	
}
