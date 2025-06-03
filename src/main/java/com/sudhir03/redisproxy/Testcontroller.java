package com.sudhir03.redisproxy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {

    @GetMapping("/test")
    public String home(){
        return "hello from proxy server";
    }
}
