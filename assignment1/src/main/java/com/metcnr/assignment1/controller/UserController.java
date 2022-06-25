package com.metcnr.assignment1.controller;

import com.metcnr.assignment1.dao.UserDao;
import com.metcnr.assignment1.entitiy.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")

public class UserController
{

    private final UserDao userDao;

    @PostMapping
    public User save(@RequestBody User user)
    {
        return userDao.save(user);
    }
    
    @GetMapping
    public List<User> findAll()
    {
        return userDao.findAll();
    }


    public List<User> findAllByProductComment(@RequestParam Long id)
    {
        return userDao.findAllByProductComment(id);
    }




}
