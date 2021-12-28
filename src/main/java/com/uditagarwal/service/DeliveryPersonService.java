package com.uditagarwal.service;

import com.uditagarwal.model.DeliveryPerson;
import com.uditagarwal.model.Slot;
import com.uditagarwal.repository.IDeliveryPersonRepository;

import lombok.NonNull;

public class DeliveryPersonService {
	
	private final IDeliveryPersonRepository deliveryPersonRepository;

    public DeliveryPersonService(IDeliveryPersonRepository deliveryPersonRepository) {
		this.deliveryPersonRepository = deliveryPersonRepository;
	}

	@NonNull
    public DeliveryPerson getDeliveryPerson(@NonNull final Slot slot) {
        // TODO: Use some strategy here to pick a delivery person.
        return null;
    }

    @NonNull
	public void addDeliveryPerson(@NonNull final DeliveryPerson deliveryPerson) {
		deliveryPersonRepository.addDeliveryPerson(deliveryPerson);
	}
}
