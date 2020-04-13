package com.alibaba.craftsman;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WangController {

    @GetMapping("/hello")
    public String hello() {
        return "hello!";
    }
}
