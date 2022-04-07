package com.springrest.sptingrest.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blog", schema = "question")

public class Blogs {
	
	@Id
	private long blogId ;
	@Column
	private String title;
	@Column
	private String description;
	@Column
	private String comment;
	
	
	@Id
	public long getBlogId() {
		return blogId;
	}
	public void setBlogId(long id) {
		this.blogId = id;
	}
	
	@Basic
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Basic
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Basic
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public Blogs(long id, String title, String description, String comment) {
		super();
		this.blogId = id;
		this.title = title;
		this.description = description;
		this.comment = comment;
	}
	
	public Blogs() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Blogs [id=" + blogId + ", title=" + title + ", description=" + description + ", comment=" + comment
				+ ", getBlogId()=" + getBlogId() + ", getTitle()=" + getTitle() + ", getDescription()="
				+ getDescription() + ", getComment()=" + getComment() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	


	
}
