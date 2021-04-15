package com.example.test.camel.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */

@RestController
public class UserController {

    @RequestMapping(value = "/myapp",method = RequestMethod.GET)
    private ResponseEntity<?> getAllData(){
        return ResponseEntity.ok("YES");
    }

}
