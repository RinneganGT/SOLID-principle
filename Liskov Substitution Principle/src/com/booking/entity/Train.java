package com.booking.entity;
import java.util.Date;


public class Train {
	 private int trainId;
	    private String sourceStation;
	    private String destinationStation;
	    private Date date;
	    private String seatClass;

	    // Constructor
	    public Train(int trainId, String sourceStation, String destinationStation, Date date, String seatClass) {
	        this.trainId = trainId;
	        this.sourceStation = sourceStation;
	        this.destinationStation = destinationStation;
	        this.date = date;
	        this.seatClass = seatClass;
	    }

	    // Getter methods
	    public int getTrainId() {
	        return trainId;
	    }

	    public String getSourceStation() {
	        return sourceStation;
	    }

	    public String getDestinationStation() {
	        return destinationStation;
	    }

	    public Date getDate() {
	        return date;
	    }

	    public String getSeatClass() {
	        return seatClass;
	    }

	   
	}

