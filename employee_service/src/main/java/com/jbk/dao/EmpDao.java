package com.jbk.dao;

import java.util.List;

import com.jbk.Employee;

public interface EmpDao {
	public Employee saveEmployee(Employee employee);
	public Employee  getEmployeeById(String id);
	public List<Employee> getAllEmployee();
	public boolean  deleteEmployee(String id );
	public boolean updateEmployee(Employee employee);


}
