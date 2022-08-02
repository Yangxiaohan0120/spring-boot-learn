package com.example.springbootlearn;

import org.springframework.web.bind.annotation.*;

/**
 * 演示各种传参形式
 * @author Chris Yang
 * created 2022-08-02 14:52
 **/

// Restful模式的controller
@RestController
public class ParaController {
    @GetMapping("/firstrequest")
    public String firstRequest(){
        return "第一个Spring Boot接口";
    }

    @GetMapping("/requestpara")
    public String requestpara(@RequestParam Integer num){
        return "para from request:" + num;
    }

    @GetMapping("/para/{num}")
    public String pathpara(@PathVariable Integer num){
        return "para from request:" + num;
    }

    @GetMapping({"/multiurl1","/multiurl2"})
    public String multiurl(@RequestParam Integer num){
        return "para from request:" + num;
    }

    @GetMapping("/required")
    public String required(@RequestParam(required = false, defaultValue = "0") Integer num){
        return "para from request:" + num;
    }
}
