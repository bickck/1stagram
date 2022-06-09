package com.team.Imitation;

import java.sql.Connection;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class SessionFactoryTest {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	@Test
	public void sqlSessionFactoryTest() {
		try {
			SqlSession session = sqlSessionFactory.openSession();
			Connection connection = session.getConnection();
			System.out.println("'Session °´Ã¼ : " + session + "'");
			System.out.println("'Connection °´Ã¼ : " + connection + "'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
