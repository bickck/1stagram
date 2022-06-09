package com.team.Imitation.repository;

import com.team.Imitation.repository.dto.MemberDTO;

public interface MemberMapper {

	public int register(MemberDTO member);

	public MemberDTO getMember(String email);

	public MemberDTO contentView(int id);

	public int modifyMemberInfo(MemberDTO dto);
	
	public int delete(String email);
	
	public void profileImage(String email, String originalFileName);

}
