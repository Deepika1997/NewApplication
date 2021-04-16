package com.program.application.service;

import com.program.application.model.Emp;
import com.program.application.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpServiceImpl implements EmpService{

    @Autowired
    private EmpRepository empRepository;

    @Override
    public List<Emp> getAllEmployees() {
        return empRepository.findAll();
    }

    @Override
    public void saveEmployee(Emp emp) {
        this.empRepository.save(emp);
    }

    @Override
    public Emp getEmployeeById(int id) {
        Optional<Emp> optional=empRepository.findById(id);
        Emp emp;
        if(optional.isPresent())
            emp=optional.get();
        else
            throw new RuntimeException("Employee not found for id:"+id);

        return emp;
    }

    @Override
    public void deleteEmployeeById(int id) {
        this.empRepository.deleteById(id);
    }

}
