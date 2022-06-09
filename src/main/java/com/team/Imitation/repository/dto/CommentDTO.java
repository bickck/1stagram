package com.team.Imitation.repository.dto;

import java.sql.Time;
import java.sql.Timestamp;

public class CommentDTO {

	private int board_id;
	private String username;
	private String content;
	private Timestamp create_at;
	private Timestamp update_at;

	public CommentDTO() {
		// TODO Auto-generated constructor stub
	}

	public CommentDTO(int board_id, String username, String content, Timestamp create_at, Timestamp update_at) {
		super();
		this.board_id = board_id;
		this.username = username;
		this.content = content;
		this.create_at = create_at;
		this.update_at = update_at;
	}

	public int getBoard_id() {
		return board_id;
	}

	public void setBoard_id(int board_id) {
		this.board_id = board_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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
