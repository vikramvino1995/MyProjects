package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
		System.out.println("Cost of Bike : Rs.90000");

	}

	@Override
	public void speed() {
		System.out.println("Speed of Bike: 80 km/hr");

	}

	public static void main(String[] args) {
			Ktm bike = new Ktm();
			bike.cost();
			bike.speed();
	}
}
