package com.demo.spring.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/emp")
public class EmpRestService {

	static Map<Integer, Employee> empDb = new HashMap<>();

	static {
		empDb.put(100, new Employee(206, "A", "Hyderabad", 35000));
		empDb.put(101, new Employee(207, "B", "Hyderabad", 45000));
		empDb.put(102, new Employee(208, "C", "Hyderabad", 55000));
		empDb.put(103, new Employee(204, "D", "Hyderabad", 65000));
		empDb.put(104, new Employee(209, "E", "Hyderabad", 75000));

	}

	@RequestMapping(path = "/info", method = RequestMethod.GET)
	public String info() {
		return "This is EMP Rest Service";
	}

	@RequestMapping(path = "/find/{id}", method = RequestMethod.GET)
	public ResponseEntity getById(@PathVariable("id") int empId) {
		if (empDb.containsKey(empId)) {
			Employee e = empDb.get(empId);
			return ResponseEntity.ok(e);
		} else {
			return ResponseEntity.ok("Employee Not Found..");
		}
	}

	@RequestMapping(path = "/save", method = RequestMethod.POST, produces = MediaType.TEXT_PLAIN_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity saveEmp(@RequestBody Employee e) {
		if (empDb.containsKey(e.getEmpId()))
			return ResponseEntity.ok("Employee Alredy Exists");
		else {
			empDb.put(e.getEmpId(), e);
			return ResponseEntity.ok("Employee Saved");
		}
	}
}
