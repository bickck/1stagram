package com.team.Imitation;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zaxxer.hikari.HikariDataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class OracleConnectionTest {

	@Autowired
	private HikariDataSource dataSource;

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USER = "instagram";
	private static final String PWD = "1234";

	@Test
	public void oracleConnectionTest() throws Exception {
		Class.forName(DRIVER);

		try (Connection connection = DriverManager.getConnection(URL, USER, PWD)) {
			System.out.println(connection);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Test
	public void springOracleConnectionTest() throws SQLException {
		try (Connection connection = dataSource.getConnection()) {
			System.out.println(connection);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
