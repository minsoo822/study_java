package com.baewooga.study.ch06;

public class CarSecondExample {

	public static void main(String[] args) {
		
		CarSecond carSecond = new CarSecond();
		String color;
		
		CarSecond carSecond2 = new CarSecond("blue");
		CarSecond carSecond3 = new CarSecond("white", 3000);
		String color2 = "Red";
		
		System.out.println(color2);
		
		
		System.out.println("carSecond.color: " + carSecond.color);
		System.out.println("carSecond2.color: " + carSecond2.color);
		System.out.println("carSecond2.cc: " + carSecond2.cc);
		
		System.out.println("carSecond3.color: " + carSecond3.color);
		System.out.println("carSecond3.cc: " + carSecond3.cc);

		

		CarSecond carSecond4 = new CarSecond("소나타");
		CarSecond carSecond5 = new CarSecond("AUDI", 3500);
		CarSecond carSecond6 = new CarSecond("BMW", 3200, "black");
		CarSecond carSecond7 = new CarSecond("white", 1200, "AUDI");
			
		
		System.out.println("carSecond4.name: " + carSecond4.name);
		System.out.println("carSecond5.name: " + carSecond5.name);
		System.out.println("carSecond5.cc: " + carSecond5.cc);
		System.out.println("carSecond6.color: " + carSecond6.color);
		System.out.println("carSecond6.name: " + carSecond6.name);
		
		System.out.println(carSecond7.cc);
		System.out.println(carSecond4.cc);
		
		
		
	}

}
