**Intro:** we are creating a software system for a pizza restaurant, one of the modules is supposed to handle the management of various pizza recipes and how the orders are put together, and a big part of the module will be the control of food types, the potential allergens in recipes, and calories counting.

**Requirements:** you are commissioned to write a data-model API (classes, interfaces, etc) which will then be used by the entire module to exchange the data about the recipes, ingredients, and all that. And also couple helper function that demonstrate the usage of your data-model.

**Tasks:** Create a data-model to represent pizza ingredients and pizza recipes, including the food types and allergens. Create a function hasAllergens where we can pass a certain pizza recipe and an array of allergens and receive true if the recipe contains any of the allergens. Create a function hasFoodTypes where we can pass a certain pizza recipe and an array of food types and receive true if this recipe contains any of the food types. Create functions removeAllergens and removeFoodTypes with similar parameters but they should return the same pizza recipe but with the allergens and food types removed. Create function removeIngredients where we can pass a certain pizza recipe and an array of ingredients and receive the pizza recipe without the specified ingredients. Create function doubleIngredients with the same parameters but it returns the recipe with the specified ingredients in double amount. Create function getCalories where we can pass a certain pizza recipe and it will return the number of total calories in that recipe.

**Example of usage for the functions:**
hasFoodTypes when user checks they want to only see pizza with mushrooms
hasAllergens when user wants to highlight any pizzas that might contain soy in it
removeIngredients when user checks they don’t want Jalapeño pepper
doubleIngredients when user checks they want double cheese
removeFoodTypes when user wants to check what the selected pizza will look like with no meat
getCalories when user wants to check what the number will be for the resulting recipe


# Project Setup

**Project has been tested using**:

MAC OS 11.0.1

JAVA 1.8

Apache Maven 3.6.0

**Project Usage**

$ mvn clean

$ mvn compile

This will execute all the test cases which contains the test input values

$ mvn test 
