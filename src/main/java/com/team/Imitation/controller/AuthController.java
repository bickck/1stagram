package com.team.Imitation.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.team.Imitation.repository.dto.LoginDTO;
import com.team.Imitation.repository.dto.MemberDTO;
import com.team.Imitation.service.AuthService;

@Controller
public class AuthController {

	private static final String LOGINSESSION = "LOGINSESSION";
	@Autowired
	private AuthService authService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView Login(@ModelAttribute LoginDTO dto, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse, HttpSession httpSession) {

		Map<String, Object> responseModel = new HashMap<String, Object>();
		MemberDTO memberDTO = authService.login(dto);
		if (memberDTO != null) {
			String sessionKey = httpServletRequest.getSession().getId();
			responseModel.put(LOGINSESSION, sessionKey);
			responseModel.put("MEMBER", memberDTO);
			httpSession.setAttribute(LOGINSESSION, responseModel);
		}
		return new ModelAndView("/index", responseModel);
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logOut(HttpSession httpSession) {
		httpSession.invalidate();
		return "/";
	}

}
