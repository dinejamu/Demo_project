package com.example.demoproject.Dao;

import com.example.demoproject.Dao.EmployeeDAO;
import com.example.demoproject.Model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    List<Employee> employees = new ArrayList<>();

    public int Add(Employee employee) {
        employees.add(employee);
        return 1;
    }

    @Override
    public List<Employee> getallemployees() {
        return employees;
    }

    /*@Override
    public List<Employee> getAllemployees() {
        return employees;
    }*/

    /*public Employee getbyid(int id) {
        for (Employee emp : employees) {
            if (emp.getEmpId() == id)
                return emp;
        }
        return null;
    }*/
}
