package com.res.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//table representing the place where the user has booked.
@Entity
@Table(name = "what_resource")
public class WhatResource {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "resource_id")
	private int resourceId;
	
	@Column(name = "resource_name")
	private String resourceName;

	
	public WhatResource(){
		
	}
	
	public WhatResource(String resourceName){
		
		this.resourceName = resourceName;
		
	}

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	@Override
	public String toString() {
		return "WhatResource [resourceId=" + resourceId + ", resourceName=" + resourceName + "]";
	}
	

	
	
	
	
	

}
