package com.uditagarwal.service;

import java.util.List;

import com.uditagarwal.model.DeliveryPerson;
import com.uditagarwal.model.Slot;
import com.uditagarwal.repository.IDeliveryPersonRepository;
import com.uditagarwal.strategies.IDeliveryPersonSelectionStrategy;

import lombok.NonNull;

public class DeliveryPersonService {
	
	private final IDeliveryPersonRepository deliveryPersonRepository;
	private final IDeliveryPersonSelectionStrategy deliveryPersonSelectionStrategy;

    public DeliveryPersonService(@NonNull final IDeliveryPersonRepository deliveryPersonRepository,
    							 @NonNull final IDeliveryPersonSelectionStrategy deliveryPersonSelectionStrategy) {
		this.deliveryPersonRepository = deliveryPersonRepository;
		this.deliveryPersonSelectionStrategy = deliveryPersonSelectionStrategy;
	}

	@NonNull
    public DeliveryPerson getDeliveryPerson(@NonNull final Slot slot) {
		List<DeliveryPerson> availableDeliveryPersons = deliveryPersonRepository.getAvailableDeliveryPersons();
		DeliveryPerson deliveryPerson = deliveryPersonSelectionStrategy.getDeliveryPerson(availableDeliveryPersons);
		deliveryPerson.setIsAssigned(true);
        return deliveryPerson;
    }

    @NonNull
	public void addDeliveryPerson(@NonNull final DeliveryPerson deliveryPerson) {
		deliveryPersonRepository.addDeliveryPerson(deliveryPerson);
	}

}
