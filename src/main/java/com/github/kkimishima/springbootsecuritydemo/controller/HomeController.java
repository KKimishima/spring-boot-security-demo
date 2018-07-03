package com.github.kkimishima.springbootsecuritydemo.controller;

import com.github.kkimishima.springbootsecuritydemo.service.SecurityDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({ "/", "/home" })
public class HomeController {
  @Autowired
  SecurityDemoService securityDemoService;

  @RequestMapping(method = RequestMethod.GET)
  public String index(){
    System.out.println(securityDemoService.findAll());
    return "home/index";
  }
}
