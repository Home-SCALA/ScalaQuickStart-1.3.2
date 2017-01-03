package com.learning.java.classobj;

/* Java: создание класса и объектов + определение поля внутри класса */

public class Customer {
	private String id;
	private final String name;
	private final String address;

	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}

	private String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public static void main(String[] args) {
		Customer c1 = new Customer("Tirthal", "Ahmedabad 380054");
		c1.setId("01");
		System.out.println( c1.getId() +  " | " + c1.getName() + " | " + c1.getAddress() );
	}
}
