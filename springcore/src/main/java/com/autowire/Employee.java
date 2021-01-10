package com.autowire;

public class Employee 
{
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setting");
		this.address = address;
	}

	public Employee() {
		super();
	}

	public Employee(Address address) {
		super();
		System.out.println("using construter");
		
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}