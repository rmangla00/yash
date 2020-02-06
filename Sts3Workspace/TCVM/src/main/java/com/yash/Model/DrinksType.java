package com.yash.Model;

public enum DrinksType {

	TEA(10), BLACK_TEA(5), COFFEE(15), BLACK_COFFEE(10);

	private final int drinkCost;

	private DrinksType(int drinkCost) {
		this.drinkCost = drinkCost;
	}

	public int getDrinkCost() {
		return drinkCost;
	}

}
