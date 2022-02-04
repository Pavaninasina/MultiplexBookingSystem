package com.capg.Service;

import java.util.Optional;

import com.capg.Model.HallCapacity;

public interface IHallCapacityService {

	public HallCapacity addHallCapacity(HallCapacity hallCapacity);

	public Optional<HallCapacity> findByHallCapacityId(int hallCapacityId);

	
}

