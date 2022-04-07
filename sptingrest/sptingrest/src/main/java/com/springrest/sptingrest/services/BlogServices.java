package com.springrest.sptingrest.services;

import java.util.List;

import com.springrest.sptingrest.entities.Blogs;

public interface BlogServices {


	public Blogs addBlog(Blogs blog);

	public Blogs displayBlog(long blogId);
	
	public void deleteBlog(long blogId);

	public Blogs updateComment(long blogId);

	public void updateBlog(Blogs blog);

	public List<Blogs> getBlogs();

}
