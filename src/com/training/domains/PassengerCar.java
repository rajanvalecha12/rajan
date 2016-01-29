package com.training.domains;

import com.training.iface.Automobile;

public class PassengerCar implements Automobile {

	@Override
	public String grtColor() {
		// TODO Auto-generated method stub
		return "red";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 456;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "scorpio";
	}

}
