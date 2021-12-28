package com.uditagarwal.strategies;

import java.util.List;
import java.util.Optional;

import com.uditagarwal.model.DeliveryPerson;

import lombok.NonNull;

public interface IDeliveryPersonSelectionStrategy {

	@NonNull
	DeliveryPerson getDeliveryPerson(@NonNull List<DeliveryPerson> deliveryPersons);
}
