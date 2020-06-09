package pl.wojtekrok.springrecipeapp.services;

import pl.wojtekrok.springrecipeapp.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand ingredientCommand);

    void deleteById (Long recipeId, Long ingredientId);
}
