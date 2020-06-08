package pl.wojtekrok.springrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.wojtekrok.springrecipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
