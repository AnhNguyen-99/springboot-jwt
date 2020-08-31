package com.jwt.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jwt.entity.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer>{
	Users findByUsername(String username);
}
