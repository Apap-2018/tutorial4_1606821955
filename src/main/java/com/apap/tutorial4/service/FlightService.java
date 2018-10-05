package com.apap.tutorial4.service;

import com.apap.tutorial4.model.FlightModel;

import java.util.List;

/**
 * FlightService
 */
public interface FlightService {
	FlightModel getFlightDetailById(String id);
	List<FlightModel> getFlightByFlightNumber(String flightNumber);
	void addFlight(FlightModel flight);
	void updateFlight(FlightModel newFlight, String flightNumber);
}
