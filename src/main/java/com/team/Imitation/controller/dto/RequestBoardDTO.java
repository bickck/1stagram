package com.team.Imitation.controller.dto;

public class RequestBoardDTO {

	public String email;
	public String title;
	public String content;

	public RequestBoardDTO() {
		// TODO Auto-generated constructor stub
	}

	public RequestBoardDTO(String email, String title, String content) {
		super();
		this.email = email;
		this.title = title;
		this.content = content;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

}
