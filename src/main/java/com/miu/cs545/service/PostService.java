package com.miu.cs545.service;

import com.miu.cs545.domain.Post;
import com.miu.cs545.domain.dto.request.PostRequest;

import java.util.List;

public interface PostService {

    public List<Post> findAll();

    public Post findById(int id);

    public void updateById(int id, PostRequest post);

    public void deleteById(int id);

    void save(PostRequest postRequest);

    List<PostRequest> findAllV2();

    List<PostRequest> findByAuthorName(String authorName);
}
