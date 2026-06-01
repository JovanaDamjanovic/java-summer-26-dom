package com.la.summer.config;

import com.la.summer.demo.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(value = "stefan")
    public Employee employee() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Stefan");
        employee.setSalary(999.99);
        employee.setAddress("Neka adresa");
        return employee;
    }

    @Bean(value = "marko")
    public Employee employee1() {
        Employee employee = new Employee();
        employee.setId(2);
        employee.setName("Marko");
        employee.setSalary(777.77);
        return employee;
    }
}
