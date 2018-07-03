package com.github.kkimishima.springbootsecuritydemo.service;

import com.github.kkimishima.springbootsecuritydemo.domain.SecurityDemo;
import com.github.kkimishima.springbootsecuritydemo.repository.SecurityDemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class UserAccountService implements UserDetailsService {

  @Autowired
  SecurityDemoRepository securityDemoRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    SecurityDemo user = securityDemoRepository.findByName(username);
    if (user == null) {
      throw new UsernameNotFoundException("The requested user is not found.");
    }
    return new LoginUserDetails(user);
  }
}

