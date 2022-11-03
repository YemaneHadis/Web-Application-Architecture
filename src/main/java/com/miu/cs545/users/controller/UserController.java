package com.miu.cs545.users.controller;

import com.miu.cs545.posts.domain.Post;
import com.miu.cs545.users.domain.dto.request.UserCreateRequest;
import com.miu.cs545.users.domain.model.User;
import com.miu.cs545.users.repository.UserRepository;
import com.miu.cs545.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<User> getAllUser(){
        return userService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public User getUser(@PathVariable int id ){
        return userService.findById(id);

    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping
    public void getAllUser(@RequestBody UserCreateRequest userCreateRequest){
         userService.save(userCreateRequest);
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}/posts")
    public List<Post> getUserPosts(@PathVariable int id ){
        return userService.findUserPost(id);

    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<User> getUsersWithMinPost(@RequestParam(required = true) int minPost){
        return userService.findUserWithMinPost( minPost);
    }












}
