package com.anpc8001.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Admin {
	@Id
    private String username;
    private String password;
}
