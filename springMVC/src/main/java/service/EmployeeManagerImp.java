package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import model.Employee;

@Service
public class EmployeeManagerImp implements EmployeeManagerInt {
	public List<Employee> getAllEmployees () {
		
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setFirstName("Lokesh");
		employee1.setLastName("Bob");
		employees.add(employee1);
		
		Employee employee2= new Employee();
		employee2.setId(1);
		employee2.setFirstName("Lokesh");
		employee2.setLastName("Bill");
		employees.add(employee2);
		
		return employees; 
	}
}
