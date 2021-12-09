package com.pille.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pille.main.entity.Recipe;


public interface RecipeRepository extends CrudRepository<Recipe, Integer> {
	
	public List<Recipe> findRecipeByRecName(String recName);

}
