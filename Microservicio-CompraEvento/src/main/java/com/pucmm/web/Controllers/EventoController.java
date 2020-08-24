package com.pucmm.web.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventoController {

    @GetMapping("/")
    public String home(){

        return "home";
    }

}
