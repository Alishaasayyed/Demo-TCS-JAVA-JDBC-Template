/**
 * 
 */
package com.tcs.model;

/**
 * @author springuser01
 *
 */
public class Employee {
	private Integer age;
	private String name;
	private Integer id;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", id=" + id + "]";
	}
}
