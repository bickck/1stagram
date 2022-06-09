package com.team.Imitation.repository.dto;

import java.sql.Timestamp;

public class BoardDTO {

	private int id;
	private String title;
	private String content;
	private String email;
	private int recommand;
	private Timestamp create_at;
	private Timestamp update_at;

	public BoardDTO() {
		// TODO Auto-generated constructor stub
	}

	public BoardDTO(int id, String title, String content, String email, int recommand, Timestamp create_at,
			Timestamp update_at) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.email = email;
		this.recommand = recommand;
		this.create_at = create_at;
		this.update_at = update_at;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRecommand() {
		return recommand;
	}

	public void setRecommand(int recommand) {
		this.recommand = recommand;
	}

	public Timestamp getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Timestamp create_at) {
		this.create_at = create_at;
	}

	public Timestamp getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(Timestamp update_at) {
		this.update_at = update_at;
	}

}
