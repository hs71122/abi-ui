package org.freethemalloc.ui.component;

public class Attribute {

	String attribute;
	String value;
	
	/**
	 * @param attribute
	 * @param value
	 */
	public Attribute(String attribute, String value) {
		this.attribute = attribute;
		this.value = value;
	}
	
	public String getAttribute() {
		return attribute;
	}
	
	public String getValue() {
		return value;
	}
}
