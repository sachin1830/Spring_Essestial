package com.springci;

public class Person 
{
	private String name;
	private String address;
	private FavProg fav;
	
	
	public Person(String name, String address, FavProg fav) {
		super();
		this.name = name;
		this.address = address;
		this.fav=fav;
	}
	@Override
	public String toString() {
		return this.name +" , " +this.address +" ," + this.fav;
	}
}
