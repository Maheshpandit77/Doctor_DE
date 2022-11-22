package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.Employee;
import com.jbk.module.Department;
import com.jbk.service.EmpService;

@RestController
@RequestMapping("/Emp")
public class EmployeeController {
	@Autowired EmpService service;
	 
 @PostMapping(value="/saveEmp")
 public  ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
	Employee emp = service.saveEmployee(employee);
	 if(emp!=null) {
	return new ResponseEntity<>(emp,HttpStatus.CREATED);
	 
 }else {
	 return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
 }

 }
 @GetMapping(value="/getEmp/{id}")
 public ResponseEntity<Employee>getEmployee(@PathVariable String id){
	 Employee employee=service.getEmployeeById(id);
	 if(employee!=null) {
		 return new ResponseEntity<>(employee,HttpStatus.FOUND);
	 }else {
		 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 }
	
	 
	 
 }
@GetMapping("/getAllEmp")
public ResponseEntity<List<Employee>> getAllEmployee() {
	List<Employee>list=service.getAllEmployee();
	if (list.isEmpty()) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}else {
		return new ResponseEntity<>(list,HttpStatus.FOUND);
	}
	
	
}
@DeleteMapping(value="/deleteEmp/{id}")
public ResponseEntity<String> deleteEmployeeById(@PathVariable String id ) {
	boolean b=service.deleteEmployee(id);
	if(b==true) {
		return new ResponseEntity<>("deleted" + id,HttpStatus.OK);
	}else {
		return new ResponseEntity<String>("Somthing went wrong"+id,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
@PutMapping("/updateEmp")
public ResponseEntity<Employee>updateEmployeeById(@RequestBody Employee employee){
	boolean b=service.updateEmployee(employee);
	if(b==true) {
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}else {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
}
@GetMapping("/getDptById/{departmentId}")
public ResponseEntity<com.jbk.module.Department>getDepartment(@PathVariable String departmentId){
	Department department= service.getDepartment(departmentId);
	if(department!=null) {
		return new ResponseEntity<>(department,HttpStatus.OK);
	}
	else {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
}}}









