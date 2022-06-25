package com.metcnr.assignment1.dao;

import com.metcnr.assignment1.entitiy.Product;
import com.metcnr.assignment1.entitiy.ProductComment;
import com.metcnr.assignment1.entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserDao extends JpaRepository<User,Long>
{

    List<User> findAllByProductComment(Long id);

}
