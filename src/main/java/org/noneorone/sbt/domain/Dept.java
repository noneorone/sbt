package org.noneorone.sbt.domain;

import java.io.Serializable;

/**
 * Department DO
 *
 * @author Mars.Wong(noneorone@yeah.net) at 2017/7/21 10:49<br/>
 * @since 1.0
 */
public class Dept implements Serializable {

	private static final long serialVersionUID = -153121427226065934L;
	
	private Integer id;
	private String name;

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

	@Override
	public String toString() {
		return "{\"id\": " + id + ", \"name\": \"" + name + "\"}";
	}
}
