package com.testapp.models;

import com.testapp.entities.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class PetType extends BaseEntity{
	
	private static final long serialVersionUID = 1L;
	private String type;
	private String name;

}
