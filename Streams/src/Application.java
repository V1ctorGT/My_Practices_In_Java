import model.Employee;
import service.EmployeeService;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;

public class Application {

	private static final int INT_ZERO = 0;
	private static final BigDecimal FIFTY_THOUSAND = new BigDecimal("50000");

	public static void main(String[] args) {

		final List<Employee> employees = obtainAllEmployees();

		// Filter employees whose salary is grater than 50k
		final List<Employee> filteredEmployees = employees.stream()
				.filter(employee -> employee.salary().compareTo(FIFTY_THOUSAND) > INT_ZERO)
				.toList();

		// Sort employees by their first name
		final List<Employee> sortedEmployees = employees.stream()
				.sorted(Comparator.comparing(Employee::firstName))
				.toList();

		// Map employees to a list of first and last names
		final List<String> employeeNames = sortedEmployees.stream()
				.map(employee -> employee.firstName() + " " + employee.lastName())
				.toList();

		// Reduce the total salary of the filtered employees
		final BigDecimal totalSalary = filteredEmployees.stream()
				.map(Employee::salary)
				.reduce(BigDecimal.ZERO, BigDecimal::add);

		// Print original employees list
		employees.forEach(employee -> System.out.println(employee.toString()));

		// Print employee names
		employeeNames.forEach(System.out::println);

		// Print the total salary
		System.out.println("Total salary of filtered employees: " + totalSalary);
	}

	private static List<Employee> obtainAllEmployees() {

		final EmployeeService employeeService = new EmployeeService();

		return employeeService.findAll();
	}
}
