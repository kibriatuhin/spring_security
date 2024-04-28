package com.example.springsecurity.customLoginLogoutPage.reporsitory;

import com.example.springsecurity.customLoginLogoutPage.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public Employee findByEmail(String email);

}
