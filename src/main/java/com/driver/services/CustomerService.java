package com.driver.services;


import java.util.List;

import com.driver.model.Customer;
import com.driver.model.Driver;
import com.driver.model.TripBooking;
import org.springframework.data.jpa.repository.Query;


public interface CustomerService {

	public void register(Customer customer);


	public void deleteCustomer(Integer customerId);
	
	public TripBooking bookTrip(int customerId, String fromLocation, String toLocation, int distanceInKm) throws Exception;
	
	public void cancelTrip(Integer tripId);

	public void completeTrip(Integer tripId);
	
}
