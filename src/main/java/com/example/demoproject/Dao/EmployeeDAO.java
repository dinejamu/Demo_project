package com.example.demoproject.Dao;

import com.example.demoproject.Model.Employee;

import java.util.List;

public interface EmployeeDAO {

    int Add(Employee employee);

    List<Employee> getallemployees();

    /*List<Employee> getAllemployees();*/

    /*Employee getbyid(int id);*/

   /* Employee getEmployee(int id);

    int deleteEmployee(int id);

    int updateEmployee(int id, Employee emp);*/
}
