package others;
//package com.team.jmaps.bookeatnow.domain.Restaurant;

import java.util.Date;
import java.util.UUID;

public class Comment {

	private UUID userId;
	private String content;
	private Date date;
	
	public Comment(UUID userId, String content, Date date) {
		super();
		this.userId = userId;
		this.content = content;
		this.date = date;
	}

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	

}