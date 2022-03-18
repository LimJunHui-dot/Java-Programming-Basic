package Lesson8;

// 클래스 사용하기
// 자동차 클래스
class Car
{
	int num;
	double gas;
	
	void showCar()
	{
		System.out.println("지금부터 자동차의 정보를 표시합니다.");
		show();
	}
	
	void setNumGas(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("차량번호를" + num + "으로, 연료 양을" + gas + "로 바꾸었습니다.");
	}
	
	int getNum()
	{
		System.out.println("차량 번호를 조사했습니다.");
		return num;
	}
	
	double getGas()
	{
		System.out.println("연료 양을 조사했습니다.");
		return gas;
	}
	
	/*void setNum(int n)
	{
		num = n;
		System.out.println("차량 번호를" + num + "으로 바꾸었습니다.");
	}
	
	void setGas(double g)
	{
		gas = g;
		System.out.println("연료 양을" + gas + "으로 바꾸었습니다.");
	}*/
	
	// 메소드 호출하기
	void show()
	{
		System.out.println("차량번호는" + num + "입니다.");
		System.out.println("연료 양은" + gas + "입니다.");
	}
}

public class usingclass {

	public static void main(String[] args){
		Car car1;
		car1 = new Car();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		System.out.println("차량번호는" + car1.num + "입니다.");
        System.out.println("연료 양은" + car1.gas + "입니다.");
	}

}
