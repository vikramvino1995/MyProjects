package org.network;

public class Wifi {
	private void wifiName() {
		System.out.println("Wifi Name: AIRTEL FIBER NET");

	}
	public static void main(String[] args) {
		Wifi w = new Wifi();
		w.wifiName();
		
		MobileData m = new MobileData();
		m.dataName();
		
		
		Lan l =new Lan();
		l.lanName();
		
		Wireless modem = new Wireless();
		modem.modemName();
	
	}
}
