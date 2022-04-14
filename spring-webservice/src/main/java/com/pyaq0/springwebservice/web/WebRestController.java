package com.pyaq0.springwebservice.web;

import com.pyaq0.springwebservice.domain.posts.PostsRepository;
import com.pyaq0.springwebservice.dto.posts.PostsSaveRequestDto;
import com.pyaq0.springwebservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsRepository postsRepository;
    private PostsService postsService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello new World";
    }

    @PostMapping("/posts")
    public Long savaPosts(@RequestBody PostsSaveRequestDto dto){
        return postsService.save(dto);
    }
}
