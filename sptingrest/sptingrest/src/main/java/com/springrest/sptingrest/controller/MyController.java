package com.springrest.sptingrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.sptingrest.entities.Blogs;
import com.springrest.sptingrest.entities.Users;
import com.springrest.sptingrest.services.BlogServices;
import com.springrest.sptingrest.services.UserServices;

@RestController
public class MyController {
	
	@Autowired
	private UserServices userService;
	
	@Autowired
	private BlogServices blogService;
	
	//Home
	@GetMapping("/home")
	public String home()
	{
		System.out.println("Apple");
		return "<html>\n" + "<header><title>Welcome</title></header>\n" +
		          "<body>\n" + "<h1>\n" +"Welcome to the application\n" + "</h1>\n" + "</body>\n" + "</html>";
	}
	
	//USERS
	
	//display all the Users
	@GetMapping("/users")
	public List<Users> getUsers()
	{
		return this.userService.getUsers();
	}
	
	
	//login the users
	@GetMapping("login/{userId}")
	public String userLogin(@PathVariable String userId)
	{
		try
		{
			this.userService.userLogin(Long.parseLong(userId));
			return "User succesfully logged in";
		}
		catch(Exception e)
		{
			return "Exception " +e + " Occured";
		}
	}

	
	//Register the user
	@PostMapping("/registeruser")
	public String registerUser(@RequestBody Users user)
	{
		try
		{
			this.userService.registerUser(user);
			return "User succesfully registered";
		}
		catch(Exception e)
		{
			return "Exception " + e + " occured";
		}
	}
	
	//Update users using post request
	@PutMapping("/users")
	public String updateUsers(@RequestBody Users user)
	{
		try 
		{
			this.userService.updateUser(user);
			return "User updated";
		}
		catch(Exception e)
		{
			return "Exception " + e + " occured";
		}
	}
	
	
	//Delete the user
	@DeleteMapping("/users/{userId}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable String userId)
	{
		try {
			this.userService.deleteUser(Long.parseLong(userId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	//BLOGS
	
	//display all the Blogs
	@GetMapping("/blogs")
	public List<Blogs> getBlogs()
	{
		return this.blogService.getBlogs();
	}
	
	
	
	//Adding a blog
	@PostMapping("/addblog")
	public String addBlog(@RequestBody Blogs blog)
	{
		try
		{
			this.blogService.addBlog(blog);
			return "Blog succesfully added";
		}
		catch(Exception e)
		{
			return "Exception " + e + " occured";
		}
	}
	
	//Display the blog
	@GetMapping("blog/{blogId}")
	public Blogs displayBlog(@PathVariable String blogId)
	{
		try
		{
			return this.blogService.displayBlog(Long.parseLong(blogId));
			
		}
		catch(Exception e)
		{
			Blogs b = new Blogs(0,"exception","exception","exception");
			return b;
		}
	}
	
	//Delete the blog
	@DeleteMapping("/blogs/{blogId}")
	public String deleteBlog(@PathVariable String blogId)
	{
		try {
			this.userService.deleteUser(Long.parseLong(blogId));
			return "Blog Deleted Successfully";
		}catch(Exception e) {
			return "Error " + e + " generated";
		}
	}
	
	//Update comment using post request
	@PostMapping("/updatecomment/{blogId}")
	public String updateComment(@PathVariable String blogId)
	{
		try 
		{
			this.blogService.updateComment(Long.parseLong(blogId));
			return "Comment updated";
		}
		catch(Exception e)
		{
			return "Exception " + e + " occured";
		}
	}
	
	
	//Update blog using post request
	@PutMapping("/blog")
	public String updateBlog(@RequestBody Blogs blog)
	{
		try 
		{
			this.blogService.updateBlog(blog);
			return "Blog updated";
		}
		catch(Exception e)
		{
			return "Exception " + e + " occured";
		}
	}
	
	
	
}
