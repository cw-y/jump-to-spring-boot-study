package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    // 만약 ResponseBody 애너테이션을 생략한다면 문자열 반환하는 대신 템플릿 파일을 찾음
    public String hello(){
        return "Hello World ,,8,";
    }
}
