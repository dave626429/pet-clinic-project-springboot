package com.testapp.entities;

import java.io.Serializable;

import lombok.Data;

@Data
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	public Boolean isNew() {
		return this.id==null;
	}

}
