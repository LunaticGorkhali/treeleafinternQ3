package com.springrest.sptingrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.springrest.sptingrest.entities.Users;


public interface UserDao extends JpaRepository<Users, Long>{

}
