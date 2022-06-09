package com.team.Imitation.repository.dto;

import java.sql.Date;
import java.sql.Timestamp;

public class MemberDTO {

	private Integer id;
	private String username;
	private String email;
	private String password;
	private String birth;
	private String address;
	private String imgName;
	private Timestamp create_at;

	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}

	public MemberDTO(String username, String email, String password, String birth, String address) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.birth = birth;
		this.address = address;
	}

	public MemberDTO(Integer id, String username, String email, String password, String birth, String address) {

		this.username = username;
		this.email = email;
		this.password = password;
		this.birth = birth;
		this.address = address;
	}

	public MemberDTO(Integer id, String username, String email, String password, String birth, String address,
			String imgName, Timestamp create_at) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.birth = birth;
		this.address = address;
		this.imgName = imgName;
		this.create_at = create_at;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", birth=" + birth + ", address=" + address + ",imagName=" + imgName + ", create_at=" + create_at
				+ "]";
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Timestamp getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Timestamp create_at) {
		this.create_at = create_at;
	}

}
