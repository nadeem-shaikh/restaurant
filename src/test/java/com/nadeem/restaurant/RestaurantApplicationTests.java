package com.nadeem.restaurant;
import static org.junit.Assert.assertEquals;

import java.util.List;

import com.nadeem.restaurant.model.Ingredient;
import com.nadeem.restaurant.model.Recipe;
import com.nadeem.restaurant.service.RecipeService;

import org.junit.Assert;
import org.junit.Test;

public class RestaurantApplicationTests {

	private static RecipeHelper recipeHelper = new RecipeHelper();
	private static RecipeService recipeService = new RecipeService();

	@Test
	public void testIfReceipeHasFoodType() {
		Recipe recipe = recipeHelper.createRecipeInstance();
		Assert.assertTrue(recipeService.hasFoodTypes(recipe, recipeHelper.getFoodType()));
	}

	@Test
	public void testIfReceipeHasAllergens() {
		Recipe recipe = recipeHelper.createRecipeInstance();
		Assert.assertTrue(recipeService.hasAllergens(recipe, recipeHelper.getAllergens()));
	}

	@Test
	public void testRemoveIngredients() {
		Recipe recipe = recipeHelper.createRecipeInstance();
		Assert.assertTrue(recipeService.hasIngredients(recipe, recipeHelper.getTestIngredients()));
		recipe = recipeService.removeIngredients(recipe, recipeHelper.getTestIngredients());
		Assert.assertTrue(!recipeService.hasIngredients(recipe, recipeHelper.getTestIngredients()));
	}

	@Test
	public void testRemoveAllergens() {
		Recipe recipe = recipeHelper.createRecipeInstance();
		Assert.assertTrue(recipeService.hasAllergens(recipe, recipeHelper.getAllergens()));
		recipe = recipeService.removeAllergens(recipe, recipeHelper.getAllergens());
		Assert.assertTrue(!recipeService.hasAllergens(recipe, recipeHelper.getAllergens()));
	}

	@Test
	public void testDoubleIngredients() {
		Recipe recipe = recipeHelper.createRecipeInstance();
		List<Ingredient> testIngredients = recipeHelper.getTestIngredients();
		recipe = recipeService.doubleIngredients(recipe, testIngredients);
		Recipe originalRecipe = recipeHelper.createRecipeInstance();
		assertEquals((originalRecipe.getIngredients().get(2).getAmount() * 2),
				recipe.getIngredients().get(2).getAmount(),0);
		assertEquals((originalRecipe.getIngredients().get(3).getAmount() * 2),
				recipe.getIngredients().get(3).getAmount(),0);
	}

	@Test
	public void testRemoveFoodTypes() {

		Recipe recipe = recipeHelper.createRecipeInstance();
		List<String> testFoodType = recipeHelper.getTestFoodType();
		Assert.assertTrue(recipeService.hasFoodTypes(recipe, testFoodType));
		recipe = recipeService.removeFoodTypes(recipe, testFoodType);
		Assert.assertTrue(!recipeService.hasFoodTypes(recipe, testFoodType));

	}

	@Test
	public void testGetCalories() {

		Recipe recipe = recipeHelper.createRecipeInstance();
		Double defaultCalorieCount = recipeService.getCalories(recipe);
		recipe = recipeService.doubleIngredients(recipe, recipe.getIngredients());
		assertEquals(defaultCalorieCount * 2, recipeService.getCalories(recipe),0);

	}
}
