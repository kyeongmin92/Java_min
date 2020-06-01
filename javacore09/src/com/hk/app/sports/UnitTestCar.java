package com.hk.app.sports;

public class UnitTestCar {

	public static void main(String[] args) {
		
		// 기본생성자로 redCar
		Car redCar = new Car();
		redCar.color = "red";
		System.out.println("색상 ="+redCar.color);
		
		// 일반생성자로 blueCar (col = blue, gear = 수동)
		Car blueCar = new Car("blue", true);
		System.out.println("색상 ="+blueCar.color+" 기어 = "+blueCar.gear);
		
		// 일반생성자로 grayCar ( col = gray, gear = 수동)
		Car grayCar = new Car("gray", false);
		System.out.println("색상 ="+grayCar.color+" 기어 = "+grayCar.gear);
		
		// 일반생성자로 blackCar ( col = black, gear = 자동, door =2
		Car blackCar = new Car("black", true, 2);
		System.out.println("색상 ="+blackCar.color+" 기어 = "+blackCar.gear+" 문 갯수= "+blackCar.door);

	}

}
