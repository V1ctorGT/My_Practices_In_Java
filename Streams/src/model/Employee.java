package model;

import java.math.BigDecimal;

public record Employee(String firstName, String lastName, BigDecimal salary) {

	@Override
	public String toString() {
		return "Employee { " +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", salary=" + salary +
				" }";
	}
}
