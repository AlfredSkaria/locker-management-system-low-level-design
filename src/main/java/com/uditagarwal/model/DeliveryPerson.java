package com.uditagarwal.model;

import lombok.Getter;
import lombok.NonNull;

@Getter
public class DeliveryPerson extends LockerUser {

	private final Integer id;
	private Boolean isAssigned;
	
	public DeliveryPerson(Contact contact,@NonNull Integer id) {
		super(contact);
		this.id = id;
		this.isAssigned = false;
	}
    
}
