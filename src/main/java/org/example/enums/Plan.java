package org.example.enums;

public enum Plan {
	BASIC("basic", 9),
	PREMIUM("premium", 12),
	ANNUAL("annual", 89);
	private final String name;
	private final int price;

	Plan(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

}