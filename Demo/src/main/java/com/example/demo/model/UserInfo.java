package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Domain Class
 * @author SIVA
 *
 */
@Entity
@Table(name = "user_info")
public class UserInfo {
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private String name;
	@Column
	private Integer age;

	public UserInfo() {
		super();
	}

	public UserInfo(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
