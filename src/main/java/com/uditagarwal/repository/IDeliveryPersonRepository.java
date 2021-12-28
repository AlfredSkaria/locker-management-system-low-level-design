package com.uditagarwal.repository;

import com.uditagarwal.model.DeliveryPerson;

import lombok.NonNull;

public interface IDeliveryPersonRepository {
	
	@NonNull
	DeliveryPerson addDeliveryPerson(@NonNull DeliveryPerson deliveryPerson);

}
