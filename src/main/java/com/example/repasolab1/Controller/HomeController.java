package com.example.repasolab1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping(value="/principal")
    public String principal(@RequestParam(name="code",required = false) String code){
        if(code==null)
            return "principal";
        else
            return "principal2";
    }
}
