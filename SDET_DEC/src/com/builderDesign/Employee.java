package com.builderDesign;

public class Employee {

	private final String name;
	private final int empId;
	private final double salary;

	// if instance variable is final then no need off setter so we remove setter
	// method
	// now Employee class is immutable

	private Employee(String name, int empId, double salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return empId;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", salary=" + salary + "]";
	}

	// inner class

	public static class Builder {

		private String name;
		private int empId;
		private double salary;

		public Builder name(String name) {
			this.name = name;
			return this;
			// this keyword return current class (Builder class) object
		}

		public Builder name(int empId) {
			this.empId = empId;
			return this;
		}

		public Builder salary(double salary) {
			this.salary = salary;
			return this;
		}

		public Employee build() {
			Employee e = new Employee(name, empId, salary);
			return e;
		}

	}

}
