package org.sparta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World!!";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get() {
        return "GET Method 요청";
    }

    @PostMapping("/post") // 메서드가 중복이 아니면 경로가 똑같아도 중복이 안됨
    @ResponseBody
    public String post() {
        return "POST Method 요청";
    }

    @PutMapping("/put")
    @ResponseBody
    public String pub() {
        return "PUT Method 요청";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete() {
        return "DELETE Method 요청";
    }
}
