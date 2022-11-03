package com.miu.cs545.users.service;

import com.miu.cs545.posts.domain.Post;
import com.miu.cs545.users.domain.dto.request.UserCreateRequest;
import com.miu.cs545.users.domain.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(int id);

    void save(UserCreateRequest userCreateRequest);

    List<Post> findUserPost(int id);

    List<User> findUserWithMinPost(int minPost);
}
