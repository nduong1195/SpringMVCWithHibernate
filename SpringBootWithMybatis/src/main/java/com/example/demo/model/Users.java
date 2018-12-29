package com.example.demo.model;

public class Users {

	private Integer id;
	private String name;
	private Long salary;

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

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Users(Integer id, String name, Long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Users() {
		super();
	}

}
