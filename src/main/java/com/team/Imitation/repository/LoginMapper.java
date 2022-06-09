package com.team.Imitation.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.team.Imitation.repository.dto.LoginDTO;
import com.team.Imitation.repository.dto.MemberDTO;

public interface LoginMapper {

	public MemberDTO login(LoginDTO loginDTO);

}
