package com.team.Imitation.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.team.Imitation.repository.dto.MemberDTO;

public interface MemberService {

	public int register(MemberDTO member);

	public void memberInfo(String email, Model model);

	public void contentView(int id, Model model);

	public String modify(MultipartHttpServletRequest mul, HttpServletRequest request);

	public String memberDelete(String email, String imgName, HttpServletRequest request);
	

}
