package org.lucifer.vbluciferpro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/employee/basic/hello")
    public String test(){
        return "/employee/basic/hello";
    }

    @GetMapping("/employee/advanced/hello")
    public String test2(){
        return "/employee/advanced/hello";
    }



}
