package com.boilerplate.APIRest.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/RESTAPI/API/V1/")
@RequiredArgsConstructor
public class TESTController {

    @GetMapping( value = "TestLogged")
    public String imLogged(){
        return "Welcome logged user";
    }
}
