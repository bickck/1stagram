package com.team.Imitation;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.team.Imitation.repository.LoginMapper;
import com.team.Imitation.repository.dto.LoginDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class LoginMapperTest {

	@Autowired
	private LoginMapper loginMapper;

	private LoginDTO dto = null;

	@Before
	public void init() {
		dto = new LoginDTO("emailTest", "passwordTest");
	}

	@Test
	public void testLoginMapper() {

		loginMapper.login(dto);
	}

}
