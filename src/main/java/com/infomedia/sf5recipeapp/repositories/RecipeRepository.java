package com.infomedia.sf5recipeapp.repositories;

import com.infomedia.sf5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
