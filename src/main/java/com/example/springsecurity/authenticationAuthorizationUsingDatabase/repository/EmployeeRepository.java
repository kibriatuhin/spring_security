package com.example.springsecurity.authenticationAuthorizationUsingDatabase.repository;

import com.example.springsecurity.authenticationAuthorizationUsingDatabase.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    public Employee findByEmail(String email);
}
