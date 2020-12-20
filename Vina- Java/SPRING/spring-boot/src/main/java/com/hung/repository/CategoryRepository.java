package com.hung.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hung.entity.CategoryEntity;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
	
	@Query("select c from CategoryEntity c where c.name = ?1")
	CategoryEntity findOneByName(String name);
	
}
