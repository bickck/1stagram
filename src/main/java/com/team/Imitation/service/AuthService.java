package com.team.Imitation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.Imitation.repository.LoginMapper;
import com.team.Imitation.repository.dto.LoginDTO;

@Service
public class AuthService {
	
	@Autowired
	private LoginMapper loginMapper;

	public boolean isEmailAndPassword(LoginDTO dto) {
		
		loginMapper.login(dto);
		
		return false;
	}
}
