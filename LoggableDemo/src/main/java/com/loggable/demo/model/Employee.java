/**
 * 
 */
package com.loggable.demo.model;

import org.springframework.stereotype.Component;

/**
 * @author rbhat
 *
 */
@Component
public class Employee {

	private String name;
	private String age;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=").append(name).append(", age=").append(age).append("]");
		return builder.toString();
	}
	
}
