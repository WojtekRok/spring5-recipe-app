package pl.wojtekrok.springrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.wojtekrok.springrecipeapp.domain.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, Long> {
}
