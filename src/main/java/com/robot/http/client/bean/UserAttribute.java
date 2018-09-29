package com.robot.http.client.bean;

public class UserAttribute implements java.io.Serializable {
	private java.lang.String name;

	private java.lang.String value;

	public UserAttribute() {
	}

	public UserAttribute(String name, String value) {
		this.name = name;
		this.value = value;
	}

	/**
	 * Gets the name value for this UserAttribute.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this UserAttribute.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the value value for this UserAttribute.
	 * 
	 * @return value
	 */
	public java.lang.String getValue() {
		return value;
	}

	/**
	 * Sets the value value for this UserAttribute.
	 * 
	 * @param value
	 */
	public void setValue(java.lang.String value) {
		this.value = value;
	}

}