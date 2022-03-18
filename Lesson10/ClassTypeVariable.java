package Lesson10;

// 클래스형 변수에 대입하기
class Car
{
	private int num;
	private double gas;
	
	// 인수로 클래스형 변수 사용하기
	private String name;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		name = "무명";
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("차량번호를 " + num + "으로, 연료 양을 " + gas + "로 바꾸었습니다.");
	}
	
	public void setName(String nm)
	{
		name = nm;
		System.out.println("차량 이름을 " + name + "로 바꾸었습니다.");
	}
	
	public void show()
    {
        System.out.println("차량 번호는 " + num + "입니다.");
        System.out.println("연료 양은 " + gas + "입니다.");
        System.out.println("이름은 " + name + "입니다.");
    } 
	
}

public class ClassTypeVariable {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Car car1;
		System.out.println("car1을 선언했습니다");
		car1 = new Car();
		car1.setCar(1234, 20.5);
		
		Car car2;
		System.out.println("car2를 선언했습니다.");
		
		car2 = car1;
		System.out.println("car2에 car1을 대입했습니다.");
		
		System.out.print("car1이 가리키는");
		car1.show();
		System.out.print("car2가 가리키는");
		car2.show();
		
		// 객체를 변경하기
		System.out.println("car1이 가리키는 차량을 변경합니다.");
		car1.setCar(2345, 30.5);
		
		System.out.print("car1이 가리키는");
		car1.show();
		System.out.print("car2가 가리키는");
		car2.show();
		
	}

}
