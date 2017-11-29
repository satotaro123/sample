package com.example.sample;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the springuser database table.
 * 
 */
@Entity
@Table(name="springuser")
//@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	//@Column(nullable = false)
	private String name;

	
	public User() {
	}
	
	public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
	

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}