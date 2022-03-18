package Lesson9;

public class Overloading {
    public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.setCar(1234, 20.5);
        car1.show();

        System.out.println("차량 번호만 변경 되었습니다.");
        car1.setCar(2345);
        car1.show();

        System.out.println("연료량만 변경 되었습니다.");
        car1.setCar(30.5);
        car1.show();
	}
}
