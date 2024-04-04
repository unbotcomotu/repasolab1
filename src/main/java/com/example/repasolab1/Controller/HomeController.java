package com.example.repasolab1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value="/principal")
    public String principal(){
        return "principal";
    }
}
