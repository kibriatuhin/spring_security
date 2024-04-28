package com.example.springsecurity.customLoginLogoutPage.service;

import com.example.springsecurity.customLoginLogoutPage.entity.Employee;
import com.example.springsecurity.customLoginLogoutPage.reporsitory.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
       Employee employee =  employeeRepository.findByEmail(email);
        if (employee == null){
            throw new UsernameNotFoundException("User name not found");
        }else {
            return  new CustomUserDetails(employee);
        }

    }
}
