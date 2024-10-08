package org.example;

import java.util.Arrays;

public class Company {
	private int id;
	private double giro;
	private String name;
	private String [] developerNames;

	public Company(int id,  String name, double giro, String[] developerNames) {
		this.id = id;
		if(giro < 0) this.giro = 0;
		this.giro = giro;
		this.name = name;
		this.developerNames = developerNames;
	}

	public void addEmployee(int index, String name){
		if (index < 0 || index >= developerNames.length) {
			System.out.println("Error: Index out of array's length");
			return;
		}
		if (developerNames[index] == null){
			developerNames[index] = name;
		}
	}

	public int getId() {
		return id;
	}

	public double getGiro() {
		return giro;
	}

	public String getName() {
		return name;
	}

	public String[] getDeveloperNames() {
		return developerNames;
	}

	@Override
	public String toString() {
		return "Company{" +
				"id=" + id +
				", giro=" + giro +
				", name='" + name + '\'' +
				", developerNames=" + Arrays.toString(developerNames) +
				'}';
	}
}
