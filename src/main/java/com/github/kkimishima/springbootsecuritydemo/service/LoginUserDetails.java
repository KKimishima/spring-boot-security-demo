package com.github.kkimishima.springbootsecuritydemo.service;

import com.github.kkimishima.springbootsecuritydemo.domain.SecurityDemo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import org.springframework.security.core.userdetails.User;

@Getter
@Setter
public class LoginUserDetails extends User{
  private SecurityDemo securityDemo;
  public LoginUserDetails(SecurityDemo securityDemo){
    super(securityDemo.getName(), securityDemo.getPass(), AuthorityUtils.createAuthorityList("ROLE_USER"));
    this.securityDemo = securityDemo;
  }

}
