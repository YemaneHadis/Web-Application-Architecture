package com.miu.cs545.repository;

import com.miu.cs545.domain.Post;
import com.miu.cs545.domain.dto.request.PostRequest;

import java.util.List;


public interface PostRepository {

    public List<Post> findAll();

    public Post findById(int id);

    public void updateById(int id, PostRequest post);

    public void deleteById(int id);

    void save(PostRequest postRequest);

    List<Post> findByAuthorName(String authorName);
}
