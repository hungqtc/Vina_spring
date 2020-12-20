package com.hung.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hung.entity.UserEntity;

@Repository
public interface UserRepository extends  JpaRepository<UserEntity, Long> {
	@Query("select u from UserEntity u where u.name = ?1")
	UserEntity findOneByName(String name);
}
