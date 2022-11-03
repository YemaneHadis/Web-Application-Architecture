package com.miu.cs545.users.repository;

import com.miu.cs545.posts.domain.Post;
import com.miu.cs545.users.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    @Query("SELECT u.posts FROM User u WHERE u.id = ?1")
    List<Post> findPostById(int id);

    @Query("SELECT u FROM User u WHERE count (u.posts) > ?1")
    List<User> findUserWithMinPost(int minPost);



}
