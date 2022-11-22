package com.jbk.module;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class Department {
	
private String departmentId;
private String departmentName;
private String departmentCode;
public Department() {
	super();
	// TODO Auto-generated constructor stub
}
public Department(String departmentId, String departmentName, String departmentCode) {
	super();
	this.departmentId = departmentId;
	this.departmentName = departmentName;
	this.departmentCode = departmentCode;
}
public String getDepartmentId() {
	return departmentId;
}
public void setDepartmentId(String departmentId) {
	this.departmentId = departmentId;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
public String getDepartmentCode() {
	return departmentCode;
}
public void setDepartmentCode(String departmentCode) {
	this.departmentCode = departmentCode;
}
@Override
public String toString() {
	return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentCode="
			+ departmentCode + "]";
}

}
