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

  @GetMapping
  public String helloWorldIndex() {
    log.info("Calling hello-world controller");
    return "Hello World Index";
  }

  @GetMapping("/static")
  public String helloWorld() {
    log.info("Calling hello-world controller");
    return "Hello World Static";
  }
}
