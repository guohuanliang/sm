package com.ghl.control;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


import com.ghl.entity.Employee;


@Component
public class TestConversionService implements Converter<String,Employee>{

	@Override
	public Employee convert(String str) {
		Employee emp=null;
		if(str!=null && str.split("-").length==3){
			emp=new Employee();
			String[] arr=str.split("-");
			emp.setName(arr[0]);
			emp.setAge(Integer.parseInt(arr[1]));
			emp.setGender(arr[2]);
		}
		return emp;
	}
	
     
}
