package io.nh_backend.ap_demo;

import org.springframework.web.bind.annotation.GetMapping;

public class testController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/bye")
    public String sayBye(){
        return "GoodBye!";
    }
}
