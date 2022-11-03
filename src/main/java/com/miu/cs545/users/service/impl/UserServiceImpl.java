package com.miu.cs545.users.service.impl;

import com.miu.cs545.helper.ListMapper;
import com.miu.cs545.posts.domain.Post;
import com.miu.cs545.users.domain.dto.request.UserCreateRequest;
import com.miu.cs545.users.domain.model.User;
import com.miu.cs545.users.repository.UserRepository;
import com.miu.cs545.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private ListMapper listMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository,ListMapper listMapper) {
        this.userRepository = userRepository;
        this.listMapper  = listMapper;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void save(UserCreateRequest userCreateRequest) {
        User user  = (User) listMapper.mapObject(userCreateRequest,new User());
        userRepository.save(user);
    }

    @Override
    public List<Post> findUserPost(int id) {
        return userRepository.findPostById(id);
    }

    @Override
    public List<User> findUserWithMinPost(int minPost) {
        return userRepository.findUserWithMinPost(minPost);
    }


}
