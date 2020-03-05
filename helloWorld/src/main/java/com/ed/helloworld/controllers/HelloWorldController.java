package com.ed.helloworld.controllers;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

  @Value("${server.port}")
  private String serverPort;

  @GetMapping
  public String helloWorld() {
    log.info("Generating a random multiplication from server @ {}", serverPort);
    return "Hello World";
  }
}
