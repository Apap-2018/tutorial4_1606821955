package com.apap.tutorial4.service;

import com.apap.tutorial4.model.FlightModel;

/**
 * FlightService
 */
public interface FlightService {
	FlightModel getFlightDetailByFlightNumber(String flightNumber);
	void addFlight(FlightModel flight);
	void updateFlight(FlightModel newFlight, String flightNumber);
}
