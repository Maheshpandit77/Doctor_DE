package com.jbk.service;

import java.util.List;

import com.jbk.Employee;
import com.jbk.module.Department;
import com.jbk.module.Employee_Department;

public interface EmpService {
	public Employee saveEmployee(Employee employee);
	public Employee  getEmployeeById(String id);
	public List<Employee> getAllEmployee();
	public boolean  deleteEmployee(String id );
	public boolean updateEmployee(Employee employee);
    public Department getDepartment(String departmentId);
    public Employee_Department getEmployeeWithDepartment(String id);
    public List<Employee_Department>getAllEmployeeWithDepartment();
}