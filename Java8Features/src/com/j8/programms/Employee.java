package com.j8.programms;

public class Employee {
private String name;
private Integer empId;
private Double empSal;
public Employee(String name, Integer empId, Double empSal) {
	super();
	this.name = name;
	this.empId = empId;
	this.empSal = empSal;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getEmpId() {
	return empId;
}
public void setEmpId(Integer empId) {
	this.empId = empId;
}
public Double getEmpSal() {
	return empSal;
}
public void setEmpSal(Double empSal) {
	this.empSal = empSal;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", empId=" + empId + ", empSal=" + empSal + "]";
}




}
