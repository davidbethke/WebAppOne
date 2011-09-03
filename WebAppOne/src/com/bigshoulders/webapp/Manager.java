package com.bigshoulders.webapp;

import java.util.ArrayList;
import java.util.List;




public class Manager extends Employee {
	Employee manager;
	private List<Employee> employees;
	public Manager(Employee manager, List<Employee> employees){
		this.manager= manager;
		this.employees=employees;
	}
	public Employee getEmployee(int id){
		Employee temp= new Employee("temp",0);
		for (Employee employee : employees){
			if(employee.getId() == id){
				temp=employee;
			}
		}
		return temp;
	}
	
	

}
