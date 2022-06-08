package com.team.Imitation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	
}
