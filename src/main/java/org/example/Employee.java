package org.example;

import java.util.Arrays;

public class Employee {
	private int id;
	private String fullName;
	private String email;
	private String password;
	private String [] healthplans;

	public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
		this.id = id;
		this.fullName = fullName;
		this.healthplans = healthPlans;
		this.password = password;
		this.email = email;
	}

	public void addHealthPlan(int index, String name){
		if (index < 0 || index >= healthplans.length) {
			System.out.println("Error: Index out of array's length");
			return;
		}
		if (healthplans[index] == null){
			healthplans[index] = name;
		}
	}

	public int getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public String getEmail() {
		return email;
	}

	public String[] getHealthPlans() {
		return healthplans;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", fullName='" + fullName + '\'' +
				", email='" + email + '\'' +
				", password='" + password + '\'' +
				", healthplans=" + Arrays.toString(healthplans) +
				'}';
	}
}
