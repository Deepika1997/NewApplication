package com.program.application.controller;

import com.program.application.model.Emp;
import com.program.application.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.AttributedString;

@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listEmployees", empService.getAllEmployees());
        return "index";
    }

    @GetMapping("/NewEmployee")
    public String NewEmployee(Model model) {
        model.addAttribute("emp", new Emp());
        return "new_emp";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("emp") Emp emp) {
        empService.saveEmployee(emp);
        return "redirect:/";
    }

    @GetMapping("/FormForUpdate/{id}")
    public String FormForUpdate(@PathVariable(value = "id") int id, Model model) {
        Emp emp = empService.getEmployeeById(id);

        model.addAttribute("emp", emp);
        return "update_emp";

    }

    @GetMapping("/FormForDelete/{id}")
    public String FormForDelete(@PathVariable(value = "id") int id) {
        this.empService.deleteEmployeeById(id);
        return "redirect:/";

    }
}
