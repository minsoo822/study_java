package com.baewooga.study.ch06;

public class IphoneExample {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		
		System.out.println("iphone.name: " + iphone.name);
		
		iphone.pr();
		
		Car car = new Car();
		
		System.out.println("car.name: " + car.name);
		
		Handbag handbag = new Handbag();
		
		System.out.println("handbag.name: " + handbag.name);
				
		car.name = "소나타";
		
		System.out.println("car.name: " + car.name);
		
		handbag.name ="보테가베네타";
		
		System.out.println("handbag.name: " + handbag.name);
				
				
		
		
		
	}

}
