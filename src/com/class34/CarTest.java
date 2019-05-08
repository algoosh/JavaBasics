package com.class34;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CarTest {

	public static void main(String[] args) {
		// Create a Map that stores number of a car and car Object
Car car1=new Car("Taoyta","T");
Car car2=new Car("Taoyta1","M2");
Car car3=new Car("Volga","V");
car1.printCarDetails();
car2.printCarDetails();
car3.printCarDetails();


Map<Integer,Car>carMap=new HashMap<>();
carMap.put(1, car1);
carMap.put(2, car2);
carMap.put(3, car3);
carMap.put(1, new Car("BMW","x8"));
carMap.put(2, new Car("Audi","T5"));
carMap.put(3, new Car("Lincloln","Ford"));

Collection<Car> carValues=carMap.values();
for(Car car:carValues) {
	car.printCarDetails();
}


	}

}
