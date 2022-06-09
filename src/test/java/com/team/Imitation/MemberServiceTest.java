package com.team.Imitation;

import java.sql.Timestamp;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.team.Imitation.repository.MemberMapper;
import com.team.Imitation.repository.dto.MemberDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberServiceTest {

	@Autowired
	private MemberMapper mapper;

	private MemberDTO memberDTO;

	@Before
	public void init() {
		memberDTO = new MemberDTO(1, "username", "email12354@gmail.com", "password1234", "2022-02-02", "°æ±âµµ");
	}

	@Test
	public void memberSaveTest() {
		// mapper.register(memberDTO);
	}

	@Test
	public void contentViewTest() {
		MemberDTO dto = mapper.contentView(1);
		System.out.println(dto.toString());
	}

	@Test
	public void modifyTest() {

	}
}
