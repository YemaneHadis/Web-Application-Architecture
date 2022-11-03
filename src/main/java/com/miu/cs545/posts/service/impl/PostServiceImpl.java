package com.miu.cs545.posts.service.impl;

import com.miu.cs545.posts.domain.Post;
import com.miu.cs545.posts.domain.dto.request.PostRequest;
import com.miu.cs545.helper.ListMapper;
import com.miu.cs545.posts.repository.PostRepository;
import com.miu.cs545.posts.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository postRepository;

    @Autowired
    ListMapper listMapper;


    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Post findById(int id) {
        return postRepository.findById(id);
    }

    @Override
    public void updateById(int id, PostRequest post) {
        postRepository.updateById(id, post);
    }

    @Override
    public void deleteById(int id) {
        postRepository.deleteById(id);
    }

    @Override
    public void save(PostRequest postRequest) {
        postRepository.save(postRequest);
    }
    @Override
    public List<PostRequest> findAllV2() {
        List<Post> posts = postRepository.findAll();
        return  listMapper.mapList(posts,PostRequest.class);
    }
    @Override
    public List<PostRequest> findByAuthorName(String authorName) {
       List<Post> posts=  postRepository.findByAuthorName(authorName);
       return listMapper.mapList(posts,PostRequest.class);
    }

    @Override
    public List<Post> findByTitle(String title) {
        return postRepository.findByTitle(title);
    }
}
