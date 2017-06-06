package ClassesAndObjects;

public class CarApp {

	public static void main(String[] args) {
		
		Car myCar = new Car("Honda", "Accord",2);
		
		myCar.setSpeed(65);
		
		myCar.Accelerate();
		
		System.out.println(myCar.toString());

	}

}
