package com.balyberdin.spring.springboot.spring_course_springbootrest.service;



import com.balyberdin.spring.springboot.spring_course_springbootrest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);

}
