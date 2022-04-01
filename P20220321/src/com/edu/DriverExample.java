package com.edu;

public class DriverExample {
	public static void main(String[] args) {

		Vehicle v1 = new Vehicle();
		v1 = new Taxi();
		v1 = new Bus();

		Driver driver = new Driver();
		driver.drive(v1); // 매개변수의 다형성. 호출 코드는 같은데 v1이 Vehicle클래스의 인스턴스인지 Taxi의 인스턴스인지에 따라 결과가 달라짐. 부모 자식
							// 관계일 때만 가능.

		Vehicle vehicle = new Vehicle();
		Taxi taxi = new Taxi();
		Bus bus = new Bus();

		System.out.println("Vehicle의 최고속력 : " + vehicle.getMaxSpeed());
		System.out.println("Taxi의 최고속력 : " + taxi.getMaxSpeed());
		System.out.println("Bus의 최고속력 : " + bus.getMaxSpeed());

		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = vehicle;
		vehicles[1] = taxi;
		vehicles[2] = bus;

		// 속도가 제일 빠른 타는 것의 정렬해서 0=taxi 1=bus 2=vehicle

		Vehicle temp = vehicles[0];
		int limit = vehicles.length - 1;
		for (int cnt = 0; cnt < limit; cnt++) {
			for (int i = 0; i < limit; i++) {
				if (vehicles[i].getMaxSpeed() < vehicles[i + 1].getMaxSpeed()) {
					temp = vehicles[i];
					vehicles[i]=vehicles[i + 1];
					vehicles[i + 1]=temp;
				}
			}
		}

			System.out.println("제일빠른거 : " + vehicles[0].toString()); //택시의 최고 속도는 120입니다
			System.out.println("제일느린거 : " + vehicles[2].toString()); //탈것의 최고 속도는 100입니다
	}
}
