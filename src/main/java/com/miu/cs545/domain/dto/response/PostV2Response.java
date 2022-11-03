package com.miu.cs545.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostV2Response {
    String title;
    String content;
    String author;
    String href;
}
