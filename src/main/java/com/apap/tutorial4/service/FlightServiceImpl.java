package com.apap.tutorial4.service;

import com.apap.tutorial4.model.FlightModel;
import com.apap.tutorial4.repository.FlightDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * FlightServiceImpl
 */
@Service
@Transactional
public class FlightServiceImpl implements FlightService {
	@Autowired
	private FlightDB flightDb;
	
	@Override
	public FlightModel getFlightDetailByFlightNumber(String flightNumber) {
		return flightDb.findByFlightNumber(flightNumber);
	}
	
	@Override
	public void addFlight(FlightModel flight) {
		flightDb.save(flight);
	}
	
	@Override
	public void updateFlight(FlightModel newFlight, String flightNumber) {
		FlightModel flight = flightDb.findByFlightNumber(flightNumber);
		
		flight.setOrigin(newFlight.getOrigin());
		flight.setDestination(newFlight.getDestination());
		flight.setTime(newFlight.getTime());
		flightDb.save(flight);
	}
}
