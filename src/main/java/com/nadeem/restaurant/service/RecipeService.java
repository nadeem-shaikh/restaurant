package com.nadeem.restaurant.service;

import java.util.List;
import java.util.stream.Collectors;

import com.nadeem.restaurant.model.Ingredient;
import com.nadeem.restaurant.model.Recipe;

public class RecipeService {


	public boolean hasFoodTypes(Recipe recipe, List<String> foodTypes) {
		return recipe.getIngredients().stream().anyMatch(ingredients -> foodTypes.contains(ingredients.getFoodType()));
	}


	public boolean hasAllergens(Recipe recipe, List<String> allergens) {
		return allergens.stream().anyMatch(allergen -> checkIfRecipeHasAnAllergen(recipe, allergen));
	}


	public Recipe removeAllergens(Recipe recipe, List<String> allergens) {

		recipe.getIngredients().removeIf(ingredient -> checkIfIngredienHasAnyAllergens(ingredient, allergens));
		return recipe;
	}


	public Recipe removeIngredients(Recipe recipe, List<Ingredient> ingredients) {
		recipe.getIngredients().removeIf(
				ingridient -> ingredients.stream().map(Ingredient::getName).anyMatch(ingridient.getName()::equals));
		return recipe;
	}


	public Recipe removeFoodTypes(Recipe recipe, List<String> foodTypes) {
		recipe.getIngredients().removeIf(ingredient -> foodTypes.contains(ingredient.getFoodType()));
		return recipe;
	}


	public Recipe doubleIngredients(Recipe recipe, List<Ingredient> ingredients) {
		List<String> ingredientNames = ingredients.stream().map(Ingredient::getName).collect(Collectors.toList());
		recipe.getIngredients().forEach(ingredient -> {
			if (ingredientNames.contains(ingredient.getName())) {
				ingredient.setAmount(ingredient.getAmount() * 2);
			}
		});
		return recipe;
	}


	public Double getCalories(Recipe recipe) {
		Double calorieCount = 0D;
		for (Ingredient ingredient : recipe.getIngredients()) {
			calorieCount += (ingredient.getCalories() * ingredient.getAmount());
		}
		return calorieCount;
	}

	private boolean checkIfIngredienHasAnyAllergens(Ingredient ingredient, List<String> allergens) {
		return ingredient.getAllergens().stream().anyMatch(allergens::contains);
	}

	private boolean checkIfRecipeHasAnAllergen(Recipe recipe, String allergen) {

		return recipe.getIngredients().stream().anyMatch(ingredient -> ingredient.getAllergens().contains(allergen));
	}

	public boolean hasIngredients(Recipe recipe, List<Ingredient> ingredients) {
		return recipe.getIngredients().stream().anyMatch(
				ingridient -> ingredients.stream().map(Ingredient::getName).anyMatch(ingridient.getName()::equals));
	}

}
