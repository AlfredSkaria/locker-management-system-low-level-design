package com.uditagarwal.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.uditagarwal.exceptions.DeliveryPersonAlreadyExistsException;
import com.uditagarwal.model.DeliveryPerson;

import lombok.NonNull;

public class DeliveryPersonRepositoryInMemory implements IDeliveryPersonRepository {
	
	private final List<DeliveryPerson> allDeliveryPersons;

	public DeliveryPersonRepositoryInMemory(List<DeliveryPerson> allDeliveryPersons) {
		this.allDeliveryPersons = new ArrayList<>();
	}

	@Override
	public @NonNull DeliveryPerson addDeliveryPerson(@NonNull DeliveryPerson deliveryPerson) {
		if(getDeliveryPerson(deliveryPerson) != null) {
			throw new DeliveryPersonAlreadyExistsException();
		}
		allDeliveryPersons.add(deliveryPerson);
		return deliveryPerson;
	}

	private DeliveryPerson getDeliveryPerson(@NonNull DeliveryPerson deliveryPerson) {
		for(DeliveryPerson delPerson : this.allDeliveryPersons) {
			if(delPerson.getId().equals(deliveryPerson.getId())) {
				return delPerson;
			}
		}
		return null;
	}

	@Override
	public @NonNull List<DeliveryPerson> getAvailableDeliveryPersons() {
		return this.allDeliveryPersons.stream()
				.filter(DeliveryPerson::getIsAssigned)
				.collect(Collectors.toList());
	}
	
}
