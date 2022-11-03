package com.miu.cs545.users.domain.model;

import com.miu.cs545.posts.domain.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue
    long id;
    String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    List<Post> posts;
}
