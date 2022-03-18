package Lesson12;

// 추상 클래스 사용하기
// 탈 것 클래스
abstract class Vehicle
{
    protected int speed;
    public void setSpeed(int s)
    {
        speed = s;
        System.out.println("속도를" + speed + "으로 변경했습니다.");
    }
    abstract void show();
}

/* 자동차 클래스
class Car extends Vehicle // class Car implements iVehicle
{
    private int num;
    private double gas;

    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("차량 번호는" + num + ", 연료 양" + gas + "인 자동차가 만들어졌습니다.");
    }

    public void show()
    {
        System.out.println("차량 번호는 " + num + "입니다.");
        System.out.println("연료 양은 " + gas + "입니다.");
        System.out.println("속도는" + speed + " 입니다.");
    }
}*/

// 비행기 클래스
class Plane implements iVehicle
{
    private int flight;

    public Plane(int f)
    {
        flight = f;
        System.out.println("비행기 번호가" + flight + "인 비행기가 만들어졌습니다.");
    }

    public void vShow()
    {
        System.out.println("비행기 번호는 " + flight + "입니다.");
        // System.out.println("속도는 " + speed + "입니다.");
    }
}

public class AbstractClass {
    public static void main(String[] args){
        /*Vehicle[] vc;
        vc = new Vehicle[2];

        vc[0] = new Car(1234, 20.5);
        vc[0].setSpeed(60);
        vc[1] = new Plane(232);
        vc[1].setSpeed(500);

        for(int i=0; i<vc.length;i++){
            vc[i].show();

            if(vc[i] instanceof Car)
            {
                System.out.println((i+1) + "번째 객체는 Car 클래스입니다.");
            }
            else
            {
                System.out.println((i+1) + "번째 객체는 Car 클래스가 아닙니다.");
            }
        }*/
    }
}
