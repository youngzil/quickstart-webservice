package org.quickstart.webservice.resteasy.example.service;

import javax.ws.rs.core.Response;

import org.quickstart.webservice.resteasy.example.model.Employee;

public interface EmployeeService {

	public Response addEmployee(Employee e);
	
	public Response deleteEmployee(int id);
	
	public Employee getEmployee(int id);
	
	public Employee[] getAllEmployees();

}
