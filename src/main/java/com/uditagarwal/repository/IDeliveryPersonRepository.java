package com.uditagarwal.repository;

import java.util.List;

import com.uditagarwal.model.DeliveryPerson;

import lombok.NonNull;

public interface IDeliveryPersonRepository {
	
	@NonNull
	DeliveryPerson addDeliveryPerson(@NonNull DeliveryPerson deliveryPerson);
	
	@NonNull
	List<DeliveryPerson> getAvailableDeliveryPersons();

}
