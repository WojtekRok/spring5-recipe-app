package pl.wojtekrok.springrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.wojtekrok.springrecipeapp.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
