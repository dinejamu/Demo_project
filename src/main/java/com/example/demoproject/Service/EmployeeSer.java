package com.example.demoproject.Service;

import com.example.demoproject.Dao.EmployeeDAO;
import com.example.demoproject.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeSer {

    @Autowired
    private EmployeeDAO employeeDAO;

    public int addemployee(Employee employee) {
    return employeeDAO.Add(employee);
    }

    public List<Employee> getallemp() {
        return employeeDAO.getallemployees();
    }

    /*public List<Employee> Getallemployee() {
        return employeeDAO.getAllemployees();
    }*/
   /* public Employee getid(int id) {
        return employeeDAO.getbyid(id);
    }*/
}
