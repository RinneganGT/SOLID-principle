package com.booking.service;

import java.time.LocalDate;

import com.booking.entity.Train;

public class TatkalBooking extends BookingService implements TatkalBookingDate {
	

    @Override
    public void bookTicket() {
        if (isBookingValid()) {
            System.out.println("Tatkal date checked");
            System.out.println("Ticket booked through TatkalBooking");
        } else {
            System.out.println("Booking is not valid. Cannot book the ticket.");
        }
    }

    @Override
    public boolean isBookingValid() {
        return true;  
    }

	
	
}
