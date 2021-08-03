package com.nadeem.restaurant.model;

import java.util.List;

public class Ingredient {
	private String name;
	private Double calories;
	private List<String> allergens;
	private String foodType;
	private Long amount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCalories() {
		return calories;
	}

	public void setCalories(Double calories) {
		this.calories = calories;
	}

	public List<String> getAllergens() {
		return allergens;
	}

	public void setAllergens(List<String> allergens) {
		this.allergens = allergens;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

}
