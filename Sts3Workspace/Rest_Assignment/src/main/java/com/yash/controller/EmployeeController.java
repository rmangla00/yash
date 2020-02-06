package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yash.model.Employee;
import com.yash.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "EmployeeController")
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@ApiOperation(value = "Get list of Employees in the System ", response = Iterable.class, tags = "getEmployees")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success|OK"),
			@ApiResponse(code = 400, message = "bad request!!!"), @ApiResponse(code = 404, message = "not found!!!") })
	@RequestMapping(method = RequestMethod.GET, value = "/employees", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@ApiOperation(value = "Get Employee in the System ", response = Employee.class, tags = "getEmployee")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success|OK"),
			@ApiResponse(code = 400, message = "bad request!!!"), @ApiResponse(code = 404, message = "not found!!!") })
	@RequestMapping(method = RequestMethod.GET, value = "/employees/{id}", produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Employee getEmployee(@PathVariable int id) {
		return employeeService.getEmployee(id);
	}

	@ApiOperation(value = "Add Employee in the System ", response = Employee.class, tags = "addEmployee")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success|OK"),
			@ApiResponse(code = 400, message = "bad request!!!"), @ApiResponse(code = 404, message = "not found!!!") })
	@RequestMapping(method = RequestMethod.POST, value = "/employees", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@ApiOperation(value = "Delete Employee in the System ", response = Employee.class, tags = "deleteEmployee")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success|OK"),
			@ApiResponse(code = 400, message = "bad request!!!"), @ApiResponse(code = 404, message = "not found!!!") })
	@RequestMapping(method = RequestMethod.DELETE, value = "/employees/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
	}

	@ApiOperation(value = "Update Employee in the System ", response = Employee.class, tags = "updateEmployee")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success|OK"),
			@ApiResponse(code = 400, message = "bad request!!!"), @ApiResponse(code = 404, message = "not found!!!") })
	@RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}", consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
		return employeeService.updateEmployee(employee, id);
	}
}
