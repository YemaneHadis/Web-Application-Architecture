package com.miu.cs545.users.domain.dto.request;

import com.miu.cs545.posts.domain.Post;
import lombok.Data;
import java.util.List;

@Data
public class UserCreateRequest {
    String name;
    List<Post> posts;
}
