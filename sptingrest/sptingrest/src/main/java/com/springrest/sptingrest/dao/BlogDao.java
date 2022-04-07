package com.springrest.sptingrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.sptingrest.entities.Blogs;

public interface BlogDao extends JpaRepository<Blogs, Long> {

}
