package com.orderbird.teamday;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringController {

    @RequestMapping("/about")
    public String index() {
        return "Hello Spring!";
    }

}
