package example.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import example.springframework.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

}
