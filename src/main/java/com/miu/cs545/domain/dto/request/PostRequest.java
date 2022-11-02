package com.miu.cs545.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PostRequest {
    String title;
    String content;
    String author;
}
