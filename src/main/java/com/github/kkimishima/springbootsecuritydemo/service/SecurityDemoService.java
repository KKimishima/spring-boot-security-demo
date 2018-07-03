package com.github.kkimishima.springbootsecuritydemo.service;

import com.github.kkimishima.springbootsecuritydemo.domain.SecurityDemo;
import com.github.kkimishima.springbootsecuritydemo.repository.SecurityDemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecurityDemoService {
  @Autowired
  SecurityDemoRepository securityDemoRepository;

  public List<SecurityDemo> findAll(){
    return securityDemoRepository.findAll();
  }
  public SecurityDemo findByName(String name){
    return securityDemoRepository.findByName(name);
  }
}
