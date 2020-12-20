
package com.hung.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hung.entity.NewsEntity;

@Repository
public interface NewsRepository extends JpaRepository<NewsEntity, Long> {
	
}
