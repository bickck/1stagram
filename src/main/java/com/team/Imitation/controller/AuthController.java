package com.team.Imitation.controller;

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team.Imitation.repository.dto.LoginDTO;
import com.team.Imitation.service.AuthService;

@Controller
public class AuthController {

	@Autowired
	private AuthService authService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public void Login(@RequestAttribute Map<String, String> requstLoginInfo, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse, HttpSession httpSession) {
		String email = requstLoginInfo.get("email");
		String password = requstLoginInfo.get("password");

		httpServletResponse.addCookie(new Cookie(email, password));
		httpServletResponse.encodeRedirectURL(httpServletRequest.getLocalAddr() + "/");

	}

	@RequestMapping(value = "/loginTest", method = RequestMethod.POST)
	public void loginTest() {
		LoginDTO dto = dto = new LoginDTO();
		dto.setEmail("emailTest");
		dto.setPassword("passwordTest");
		System.out.println(authService.login(dto));
	}
}
