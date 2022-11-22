package com.jbk;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Table
@Entity
public class Employee {
@Id
	private String id;
    private String name;
    private String city;
    private String departmentId;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String id, String name, String city, String departmentId) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.departmentId = departmentId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", departmentId=" + departmentId + "]";
	}
	
}