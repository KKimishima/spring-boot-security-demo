package com.github.kkimishima.springbootsecuritydemo.repository;

import com.github.kkimishima.springbootsecuritydemo.domain.SecurityDemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityDemoRepository extends JpaRepository<SecurityDemo,Long> {

  public SecurityDemo findByName(String name);
}
