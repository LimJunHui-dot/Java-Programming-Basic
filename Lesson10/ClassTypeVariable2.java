package Lesson10;

public class ClassTypeVariable2 {
    public static void main(String[] args) {
		Car car1;
		car1 = new Car();
		car1.show();
		int number = 1234;
		
		double gasoline = 20.5;
		String str = "1호차";
		
		car1.setCar(number, gasoline);
		car1.setName(str);
		
		car1.show();
	}
}
