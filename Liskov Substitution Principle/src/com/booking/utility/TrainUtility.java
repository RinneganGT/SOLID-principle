package com.booking.utility;

import java.util.Scanner;

import com.booking.service.BookingService;
import com.booking.service.NormalBooking;
import com.booking.service.TatkalBooking;

public class TrainUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type of booking : 1.Normal Booking 2.Tatkal Booking");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		BookingService bookingService;
        switch (choice) {
            case 1:
                System.out.println("You selected Normal Booking.");
                bookingService = new NormalBooking();
                bookingService.bookTicket();
                break;
            case 2:
                System.out.println("You selected Tatkal Booking.");
                bookingService = new TatkalBooking();
                bookingService.bookTicket();

                break;
            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
        }
	}

}
