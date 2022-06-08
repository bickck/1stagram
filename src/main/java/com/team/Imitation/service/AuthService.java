package com.team.Imitation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.Imitation.repository.LoginMapper;
import com.team.Imitation.repository.dto.LoginDTO;
import com.team.Imitation.repository.dto.MemberDTO;

@Service
public class AuthService {

	@Autowired
	private LoginMapper loginMapper;

	public MemberDTO login(LoginDTO dto) {

		return null;
	}
}
