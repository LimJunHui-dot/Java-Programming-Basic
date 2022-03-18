package Lesson9;

public class Classvariable {

	public static void main(String[] args) {
		Car.showSum();
		Car car1 = new Car();
		car1.show();
		
		Car.showSum();
		
		Car car2 = new Car(1234, 20.5);
		car2.show();
		
		Car.showSum();
	}

}
