package com.ghl.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ghl.entity.Employee;

@Controller
public class Control {
	@RequestMapping(value="test")
    public String EmployeeController(Employee employee){
    	System.out.println(employee);
    	return "index";
    }
}
