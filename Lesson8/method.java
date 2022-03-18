package Lesson8;

public class method {
	public static void main(String[] args) {
		Car car1;
		car1 = new Car();
		
		//int number = 1234;
		//double gasoline = 20.5;
		
		car1.setNumGas(1234, 20.5);
		
		int number = car1.getNum();
		double gasoline = car1.getGas();
		
		System.out.println("샘플 자동차를 조사한 결과");
		System.out.println("차량 번호는" + number + "연료 양은" + gasoline + "이었습니다.");
		
		
		//car1.setNum(1234);
		//car1.setGas(20.5);
		
		//car1.num = 1234;
		//car1.gas = 20.5;
		
		// car1.show();
		// car1.show();
		
		// 클래스 안에서 메소드 호출하기
		car1.showCar();
	}
}

