package pl.wojtekrok.springrecipeapp.services;

import pl.wojtekrok.springrecipeapp.commands.RecipeCommand;
import pl.wojtekrok.springrecipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand findCommandById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);

    void deleteById (Long idToDelete);
}
