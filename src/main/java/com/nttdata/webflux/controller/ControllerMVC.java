package com.nttdata.webflux.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import com.nttdata.webflux.model.Employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMVC {

	@GetMapping("/listar")
	public List<BigDecimal> findAll() {
		return Arrays.asList(BigDecimal.ZERO, BigDecimal.ONE, BigDecimal.TEN);
	}

	@GetMapping("/listarEmpleados")
	public List<Employee> findAllEmployee() {
		Employee emp1 = new Employee(1, "David Silva");

		Employee emp2 = new Employee();
		emp2.setIdEmployee(2);
		emp2.setFullName("Carlos Miguel");

		return Arrays.asList(emp1,
				emp2,
				new Employee());
	}

}
