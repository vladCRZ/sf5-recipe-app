package com.infomedia.sf5recipeapp.repositories;

import com.infomedia.sf5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
