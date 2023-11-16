package com.gyanoholic.oopbasics;

// CAR Has-A engine - Composition
// CAR Is-A vehicle - Inheritance
public class Car {
	
	Chassis chassis;
	Engine engine;
	Steering steering;
	Transmission transmission;
	
	void startCar() {
		engine.isRuning = true;
	}
	
	void moveVehicle(int speed) {
		if(engine.isRuning) {
			transmission.numGears +=1;
			System.out.println("Vehicle started running at "+speed+" km/hr");
		}else {
			System.out.println("Please start vehicle first");
		}
	}
	
	public static void main(String[] args) {
		Car santro = new Car();
		Engine fiat = new Engine();
		Transmission t = new Transmission();
		santro.engine = fiat;
		santro.transmission = t;
		t.numGears = 4;
		santro.engine.isRuning = false;
		santro.moveVehicle(20);
	}
	
}
