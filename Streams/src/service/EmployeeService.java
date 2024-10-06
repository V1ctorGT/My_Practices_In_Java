package service;

import model.Employee;
import repository.EmployeeRepository;

import java.math.BigDecimal;
import java.util.List;

public class EmployeeService implements EmployeeRepository {

	@Override
	public List<Employee> findAll() {

		return List.of(
				new Employee("John", "Doe", new BigDecimal(60000)),
				new Employee("Jane", "Smith", new BigDecimal(45000)),
				new Employee("Mike", "Johnson", new BigDecimal(52000)),
				new Employee("Emily", "Davis", new BigDecimal(48000))
		);
	}
}
