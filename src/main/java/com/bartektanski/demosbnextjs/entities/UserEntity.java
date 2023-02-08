package com.bartektanski.demosbnextjs.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="users")
@Data
public class UserEntity {
	  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;
	private String firstName;
	private String lastName;
	private String emailId;
}
