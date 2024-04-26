/*
package com.example.springsecurity.inMemoryLevelSecurity.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller

public class HomeController {

    @RequestMapping("/index")
    @PreAuthorize("hasAnyAuthority('ROLE_USER')")
    public String index(){
        return "index";
    }
    @RequestMapping("/home")
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
    public String home(){
        return "home";
    }
    @RequestMapping("/about")
    @PreAuthorize("hasAnyAuthority('ROLE_USER')")
    public String about(){
        return "about";
    }
}
*/
