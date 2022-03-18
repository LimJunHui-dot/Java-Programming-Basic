package Lesson9;

class Car
{
	// 클래스 변수
	public static int sum = 0;
	
	
	// 맴버에 대한 접근을 제한하기
	// 인스턴스 변수
	private int num;
	private double gas;
	
	public void setNumGas(int n, double g)
	{
		if(g > 0 && g < 1000)
		{
			num = n;
			gas = g;
			System.out.println("차량 번호를" + num + "으로, 연료 양을" + gas + "로 바꾸었습니다.");
		}
		else {
			System.out.println(g + "는 올바른 연료 양이 아닙니다.");
			System.out.println("연료 양을 바꿀 수 없습니다.");
		}
	}
	
	public void setCar(int n)
	{
		num = n;
		System.out.println("차량 번호를" + num + "으로 바꾸었습니다.");
	}
	public void setCar(double g)
	{
		gas = g;
		System.out.println("연료 양을" + gas + "으로 바꾸었습니다.");
	}
	
	// 인스턴스 메소드
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("차량 번호를" + num + "으로, 연료양을" + gas + "로 바꾸었습니다.");
	}
	
	// 클래스 메소드
	public static void showSum()
	{
		System.out.println("자동차는 모두" + sum + "대 있습니다.");
	}
	
	// 생상자를 오버로딩하기
	public Car()
	{
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public Car(int n, double g)
	{
		// 다른 생성자를 호출하기
		this();
		num = n;
        gas = g;
        System.out.println("차량 번호를" + num + "으로, 연료양을" + gas + "로 바꾸었습니다.");
	}
	
	public void show()
    {
        System.out.println("차량 번호는" + num + "입니다.");
        System.out.println("연료 양은" + gas + "입니다.");
    }  

}

public class ClassFunction {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		// 이러한 접근이 불가능합니다.
		// car1.num = 1234;
		// car1.gas = -10.0;
		
		car1.setNumGas(1234, 20.5);
		car1.show();
		
		System.out.println("잘못된 연료 양을 (-10.0)을 저장하겠습니다.....");
		
		car1.setNumGas(1234, -10.0);
		car1.show();
		
	}

}
