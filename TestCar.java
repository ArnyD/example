
public class TestCar extends Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.color = "red";
		car2.color = "black";
		car1.speed = 150;
		car2.speed = 200;
		
		System.out.println("The colors of my cars are: " + car1.color + " and " + car2.color);
		System.out.println("The speed of my cars are: " + car1.speed + " and " + car2.speed);
	}

}
