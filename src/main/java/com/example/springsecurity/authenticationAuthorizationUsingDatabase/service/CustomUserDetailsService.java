package com.example.springsecurity.authenticationAuthorizationUsingDatabase.service;

import com.example.springsecurity.authenticationAuthorizationUsingDatabase.config.CustomUser;
import com.example.springsecurity.authenticationAuthorizationUsingDatabase.entity.Employee;
import com.example.springsecurity.authenticationAuthorizationUsingDatabase.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
     Employee employee = employeeRepository.findByEmail(email);
     if (employee == null){
         throw new UsernameNotFoundException("User name not found");
     }else {
         return  new CustomUser(employee);
     }

    }
}
