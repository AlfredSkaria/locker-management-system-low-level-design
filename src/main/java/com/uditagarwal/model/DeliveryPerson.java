package com.uditagarwal.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
public class DeliveryPerson extends LockerUser {

	private final Integer id;
	@Setter
	private Boolean isAssigned;
	
	public DeliveryPerson(Contact contact,@NonNull Integer id) {
		super(contact);
		this.id = id;
		this.isAssigned = false;
	}
    
}
