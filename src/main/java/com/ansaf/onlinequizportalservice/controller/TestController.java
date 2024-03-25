package com.ansaf.onlinequizportalservice.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TestController {

//    http://localhost:9192/api/test?a=5&b=4
    @GetMapping("/test")
    public int testRequestParam(@RequestParam int a, @RequestParam int b){
        return a + b;
    }

//    http://localhost:9192/api/test/6/7
    @GetMapping("/test/{c}/{d}")
    public int testPathVariable(@PathVariable int c, @PathVariable int d){
        return c * d;
    }


}
