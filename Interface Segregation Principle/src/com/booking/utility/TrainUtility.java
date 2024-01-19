package com.booking.utility;

import java.util.Scanner;

import com.booking.service.BookTicket;
import com.booking.service.CancelTicket;
//import com.booking.service.BookingService;
import com.booking.service.NormalBooking;
import com.booking.service.NormalTicketCancellation;
import com.booking.service.TatkalBooking;

public class TrainUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.Normal Booking 2.Tatkal Booking 3.Cancel");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		BookTicket bookTicket;
		CancelTicket cancelTicket;
        switch (choice) {
            case 1:
                System.out.println("You selected Normal Booking.");
                bookTicket = new NormalBooking();
                bookTicket.bookTicket();
                break;
            case 2:
                System.out.println("You selected Tatkal Booking.");
                bookTicket = new TatkalBooking();
                bookTicket.bookTicket();

                break;
            case 3:
            	cancelTicket = new NormalTicketCancellation();
                cancelTicket.cancelTicket();

                break;
            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
        }
		

	}

}
