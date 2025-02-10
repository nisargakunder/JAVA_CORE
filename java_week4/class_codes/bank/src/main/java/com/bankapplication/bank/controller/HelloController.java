package com.bankapplication.bank.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path = "home")
    public String home(){
        return "home";
    }
   @PreAuthorize("hasRole = ('ADMIN')")
    @GetMapping(path = "admin")
    public String admin(){
        return "admin";
    }

    @PreAuthorize(("hasRole('ADMIN') or hasRole('MGR') "))
    @GetMapping(path = "mgr")
    public String mgr(){
        return "mgr";
    }
    @PreAuthorize(("hasRole('ADMIN') or hasRole('MGR') or hasRole('CLERK')"))
    @GetMapping(path = "clerk")
    public String clerk(){
        return "clerk";
    }
}