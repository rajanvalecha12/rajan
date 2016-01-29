package com.training.domains;

public class Showroom {
	public Automobile getItem(int key)
	{
		switch(key){
		case 1:
			return new PassengerCar();
		case2:
			return new Luxurycar();
		case 3:
			return new Sportscar();
			default:
				return null;
		}
	}
public void printQuote(Automobile polyAuto)
{
	System.out.println("======Quotation======");;
	System.out.println("model :="+polyAuto.getModel());
			System.out.println("color:=" + polyAuto.getColor());
					System.out.println("price :="+ polyAuto.getPrice());getClass()
					System.out.println();
					System.out.println();
}
}
