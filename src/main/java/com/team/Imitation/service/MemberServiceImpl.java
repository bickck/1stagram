package com.team.Imitation.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.team.Imitation.repository.MemberMapper;
import com.team.Imitation.repository.dto.MemberDTO;

public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberMapper mapper;
	
	
	@Override
	public int register(MemberDTO member) {
		try {
			return mapper.register(member);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	
	
}
