package com.springci;

public class FavProg 
{
	private String favlag;

	@Override
	public String toString() {
		return this.favlag;
	}

	public FavProg(String favlag) {
		super();
		this.favlag = favlag;
	}
}
