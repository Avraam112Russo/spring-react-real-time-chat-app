package com.n1nt3nd0.springreactwebsocketchatapp.utils;

import com.n1nt3nd0.springreactwebsocketchatapp.config.UserDetailsImpl;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.security.Principal;

@Component
public class SecurityUtils {

  public UserDetailsImpl getUserDetails(Principal principal) {
    UsernamePasswordAuthenticationToken user = (UsernamePasswordAuthenticationToken) principal;
    Object object = user.getPrincipal();
    return (UserDetailsImpl) object;
  }

  public UserDetailsImpl getUser() {
    Object object = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    return (UserDetailsImpl) object;
  }
}
