package com.program.application.service;

import com.program.application.model.Emp;

import java.util.List;

public interface EmpService {

    List<Emp> getAllEmployees();
    void saveEmployee(Emp emp);
    Emp getEmployeeById(int id);
    void deleteEmployeeById(int id);
}
