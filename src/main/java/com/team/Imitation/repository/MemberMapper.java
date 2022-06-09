package com.team.Imitation.repository;

import com.team.Imitation.repository.dto.MemberDTO;

public interface MemberMapper {

	public int register(MemberDTO member);

	public MemberDTO getMember(String email);

	public MemberDTO contentView(int id);

	public int modify(MemberDTO dto);
	
	public int delete(String email);

}
