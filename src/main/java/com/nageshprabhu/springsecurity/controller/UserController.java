package com.nageshprabhu.springsecurity.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @GetMapping("/users")
  public ResponseEntity<String> getUsers() {
    return new ResponseEntity<>("Nagesh", HttpStatusCode.valueOf(200));
  }
}
