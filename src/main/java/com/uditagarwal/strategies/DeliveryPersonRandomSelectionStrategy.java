package com.uditagarwal.strategies;

import java.util.List;

import com.uditagarwal.exceptions.DeliveryPersonNotFoundException;
import com.uditagarwal.model.DeliveryPerson;

import lombok.NonNull;

public class DeliveryPersonRandomSelectionStrategy implements IDeliveryPersonSelectionStrategy {

	@Override
	public DeliveryPerson getDeliveryPerson(@NonNull List<DeliveryPerson> deliveryPersons) {
		return deliveryPersons.stream().findAny().orElseThrow(DeliveryPersonNotFoundException::new);
	}

}
