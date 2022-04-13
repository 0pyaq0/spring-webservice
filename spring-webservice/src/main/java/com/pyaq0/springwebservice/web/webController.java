package com.pyaq0.springwebservice.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Controller
@AllArgsConstructor
public class webController {

    @GetMapping("/")
    public String main() {
        return "main";
    }

}
