package com.hackathon.pojo;

import java.util.List;

public class Book {

	private Integer id;
	
	protected Integer isbnum;

	protected String name;

	protected String org;

	protected String author;

	protected List<Chapters> chapters;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIsbnum() {
		return isbnum;
	}

	public void setIsbnum(Integer isbnum) {
		this.isbnum = isbnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public List<Chapters> getChapters() {
		return chapters;
	}

	public void setChapters(List<Chapters> chapters) {
		this.chapters = chapters;
	}

}
