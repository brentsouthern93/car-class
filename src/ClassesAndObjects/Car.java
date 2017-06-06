package ClassesAndObjects;

public class Car {

	private String brand;
	private String model;
	private int numOfdoors;
	private int speed;
	
	public Car() {
		
	}
	
	public Car(String carBrand, String carModel, int doors) {
		brand = carBrand;
		model = carModel;
		numOfdoors = doors;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int setSpeed) {
		speed = setSpeed;
	}
	
	public void Accelerate(){
		speed += 5;
	}
	
	@Override
	public String toString() {
		return "Brand: "+brand+"\n"+ "Model: "+model+"\n" + "Doors: "+numOfdoors+"\n"+"Speed: "+speed;
	}
	
		

	}


