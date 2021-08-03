package com.nadeem.restaurant.model;

import java.util.List;

public class Recipe {
	private List<Ingredient> ingredients;
	private String description;

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
