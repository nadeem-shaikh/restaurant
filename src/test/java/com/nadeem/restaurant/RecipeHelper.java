package com.nadeem.restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.nadeem.restaurant.model.Ingredient;
import com.nadeem.restaurant.model.Recipe;

 public class RecipeHelper {
	public Recipe createRecipeInstance() {
		Recipe recipe = new Recipe();
		recipe.setDescription(
				"With American cheese, grilled chicken, jalape�os. Pizza is topped off with provolone and brings crave-worthy Mexican food flavors to the Domino's Specialty Pizzas lineup. You'll never miss the taco shell with a Hand Tossed or Crunchy Thin crust.");
		recipe.setIngredients(createIngredients());
		return recipe;
	}

	public List<String> getFoodType() {
		return new ArrayList<>(Arrays.asList("Meat"));
	}

	public List<String> getAllergens() {
		return new ArrayList<>(Arrays.asList("Eggs"));
	}

	private List<Ingredient> createIngredients() {
		List<Ingredient> ingredients = new ArrayList<>();
		ingredients.add(getAmericanCheese());

		ingredients.add(getGrilledChicken());

		ingredients.add(getJalepeno());

		ingredients.add(getProvolone());

		return ingredients;
	}

	public List<Ingredient> getTestIngredients() {
		List<Ingredient> ingredients = new ArrayList<>();

		ingredients.add(getJalepeno());

		ingredients.add(getProvolone());

		return ingredients;
	}

	private Ingredient getJalepeno() {
		Ingredient jalapenos = new Ingredient();
		jalapenos.setName("Jalapenos");
		jalapenos.setCalories(20.0);
		jalapenos.setAmount(4L);
		jalapenos.setFoodType("Pepper");
		jalapenos.setAllergens(new ArrayList<>(Arrays.asList("Capsaicin")));
		return jalapenos;
	}

	private Ingredient getGrilledChicken() {
		Ingredient grilledChicken = new Ingredient();
		grilledChicken.setName("Grilled chicken");
		grilledChicken.setCalories(180.0);
		grilledChicken.setAmount(1L);
		grilledChicken.setFoodType("Meat");
		grilledChicken.setAllergens(new ArrayList<>(Arrays.asList("Eggs")));
		return grilledChicken;
	}

	private Ingredient getAmericanCheese() {
		Ingredient americanCheese = new Ingredient();
		americanCheese.setName("American Cheese");
		americanCheese.setCalories(63.5);
		americanCheese.setAmount(1L);
		americanCheese.setFoodType("Dairy");
		americanCheese.setAllergens(new ArrayList<>(Arrays.asList("Milk")));
		return americanCheese;
	}

	private Ingredient getProvolone() {
		Ingredient provolone = new Ingredient();
		provolone.setName("Provolone");
		provolone.setCalories(69.21);
		provolone.setAmount(1L);
		provolone.setFoodType("Dairy");
		provolone.setAllergens(new ArrayList<>(Arrays.asList("Milk")));
		return provolone;
	}

	public List<String> getTestFoodType() {
		return new ArrayList<>(Arrays.asList("Dairy", "Meat"));
	}
}
