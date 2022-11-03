package com.miu.cs545.helper;

import com.miu.cs545.domain.Post;
import com.miu.cs545.domain.dto.request.PostRequest;
import com.miu.cs545.domain.dto.response.PostV2Response;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ListMapper<T,E> {

    @Autowired
    ModelMapper modelMapper;


    /***
     *
     *
     * @Author - Dr. Muhyieddin
     *
     * I took this helper function from the demo code
     * because I like the way u structured it.
     */
    public List<PostV2Response> changeToPostV2(List<Post> posts){
            List<PostV2Response> postV2Responses = new ArrayList<>();
        for (Post post : posts) {
            Pos
        }

        //Ihave list of posts and
        // for every post I am going to add
    }

    public List<?> mapList(List<T> list , E convertTo){
       return list.stream()
                .map(e->modelMapper.map(e,convertTo.getClass()))
                .collect(Collectors.toList());
    }
}
