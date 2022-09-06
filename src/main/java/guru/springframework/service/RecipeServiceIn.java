package guru.springframework.service;

import java.util.Set;

import guru.springframework.domain.Recipe;

public interface RecipeServiceIn {

	 Set<Recipe> getRecipes();
}
