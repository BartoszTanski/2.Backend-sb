package com.bartektanski.demosbnextjs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bartektanski.demosbnextjs.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long>{

}
