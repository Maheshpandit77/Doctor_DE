package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jbk.Employee;
import com.jbk.dao.EmpDao;
import com.jbk.module.Department;
import com.jbk.module.Employee_Department;
@Service
public class EmpService_Impl implements EmpService {
 @Autowired EmpDao dao;
 @Autowired 
 private RestTemplate resttemplate;
	@Override
	public Employee saveEmployee(Employee employee) {
	  Employee emp=dao.saveEmployee(employee);
		return emp;
	}

	@Override
	public Employee getEmployeeById(String id) {
		Employee employee  =   dao.getEmployeeById(id);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
	List<Employee>list=dao.getAllEmployee();
		return list;
	}

	@Override
	public boolean deleteEmployee(String id) {
		  boolean b=   dao.deleteEmployee(id);
		return b;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
	boolean b= dao.updateEmployee(employee);
		return b;
	}

	@Override
	public Department getDepartment(String departmentId) {
		
	Department department=	resttemplate.getForObject("localhost:8081/Dpt/getDpt/"+departmentId, Department.class);
		System.out.println("i amin dpt");
		return department;
	}

	@Override
	public Employee_Department getEmployeeWithDepartment(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee_Department> getAllEmployeeWithDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

}
