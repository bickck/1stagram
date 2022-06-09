package com.team.Imitation.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.team.Imitation.repository.MemberMapper;
import com.team.Imitation.repository.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper mapper;
	
	@Autowired
	private MemberFileService mfs;

	@Override
	public int register(MemberDTO member) {
		try {
			return mapper.register(member);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public void memberInfo(String email, Model model) {
		MemberDTO dto = mapper.getMember(email);
		model.addAttribute("memberInfo",dto);
	}

	@Override
	public void contentView(int id, Model model) {
		model.addAttribute("data", mapper.contentView(id));
	}

	@Override
	public String modify(MultipartHttpServletRequest mul, HttpServletRequest request) {
		MemberDTO dto = new MemberDTO();
		dto.setUsername(mul.getParameter("username"));
		dto.setEmail(mul.getParameter("email"));
		dto.setPassword(mul.getParameter("password"));
		
		MultipartFile file = mul.getFile("imgName");
		if(file.getSize()!=0) { 
			dto.setImgName(mfs.saveFile(file));
			mfs.deleteImage(mul.getParameter("originFileName"));
		} else {
			dto.setImgName(mul.getParameter("originFileName"));
		}

		int result = mapper.modifyMemberInfo(dto);
		
		String msg, url;
		if(result == 1) {
			msg = "�궡�슜�씠 蹂�寃� �릺�뿀�뒿�땲�떎";
			url = "";
		} else {
			msg = "�닔�젙 �삤瑜섏엯�땲�떎";
			url = "";
		}
		return mfs.getMessage(request, msg, url);
	}

	@Override
	public String memberDelete(String email, String imgName, HttpServletRequest request) {
		int result = mapper.delete(email);
		String msg, url;
		if(result == 1) {
			msg="�궘�젣 �릺�뿀�뒿�땲�떎";
			url="";
			mfs.deleteImage(imgName);
		} else {
			msg = "�궘�젣 �삤瑜�";
			url = "";
		}
		return mfs.getMessage(request, msg, url);
	}

	
	

}
