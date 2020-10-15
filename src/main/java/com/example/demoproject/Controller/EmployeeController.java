package com.example.demoproject.Controller;

import com.example.demoproject.Model.Employee;
import com.example.demoproject.Service.EmployeeSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/employee")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeSer employeeSer;

    @PostMapping
    public int Addemployee(@RequestBody Employee employee){
        return employeeSer.addemployee(employee);
    }

    @GetMapping
    public List<Employee> getemp(){
    return employeeSer.getallemp();
    }

    /*@GetMapping
    public List<Employee> GetAll(){
        System.out.println("calling");
        return employeeSer.Getallemployee();
    }
*/
    /*@GetMapping(path = "{id}")
    public Employee getid(@PathVariable("id") int id){
    return EmployeeSer.getid(id);
    }*/
}
