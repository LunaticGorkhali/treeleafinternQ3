package com.springrest.sptingrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.sptingrest.dao.BlogDao;
import com.springrest.sptingrest.entities.Blogs;


@Service
public class BlogServicesImpl implements BlogServices {

	@Autowired
	private BlogDao blogDao;

	@Override
	public Blogs addBlog(Blogs blog) {
		blogDao.save(blog);
		return blog;
	}

	@Override
	public Blogs displayBlog(long blogId) {

		return blogDao.getById(blogId);
	}

	@Override
	public void deleteBlog(long blogId) {
		 
		Blogs entity = blogDao.getById(blogId);
		blogDao.delete(entity);
	}

	@Override
	public Blogs updateComment(long blogId) {
		  Blogs u = null;
		  
		  for(Blogs blog:blogDao.findAll()) {
			  if(blog.getBlogId() == blogId) 
			  {
				  u = blog;
				  break;
			}
			  
		  }
		  
		  //list.remove(u);
		
		blogDao.save(u);
		return u;
	}

	
	@Override
	public void updateBlog(Blogs blog) {

		blogDao.save(blog);
		
	}

	@Override
	public List<Blogs> getBlogs() {
		return blogDao.findAll();
	}
	
	


	

}
