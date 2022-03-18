package Lesson11;

// 클래스를 확장하기
// 자동차 클래스
class Car
{
    // protected 맴버에 접근하기
    protected int num;
    protected double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("자동차가 만들어졌습니다.");
    }

    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("차량 번호를 " + num + "으로, 연료 양을 " + gas + "로 만들어졌습니다.");
    }


    public void setCar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("차량 번호를 " + num + "으로, 연료 양을 " + gas + "로 바꾸었습니다.");
    }

    public void show()
    {
        System.out.println("차량 번호는 " + num + "입니다.");
        System.out.println("연료 양은 " + gas + "입니다.");
    } 

    //to String() 메소드 오버라이딩하기
    public String toString()
    {
        String str = "차량 번호: " + num + "연료 양: " + gas;
        return str;
    }
}

// 레이싱 카 클래스
class RacingCar extends Car
{
    private int course;

    public RacingCar()
    {
        course = 0;
        System.out.println("레이싱 카가 만들어졌습니다.");
    }

    public RacingCar(int n, double g, int c)
    {
        super(n, g);
        course = c;
        System.out.println("코스 번호가 " + course + "인 레이싱 카가 만들어 졌습니다.");
    }

    public void setCourse(int c)
    {
        course = c;
        System.out.println("코스 번호를 " + course + "로 했습니다.");
    }

    public void newShow()
    {
        System.out.println("레이싱 카의 차량 번호는 " + num + "입니다.");
        System.out.println("연료 양은 " + gas + "입니다.");
        System.out.println("코스 번호는" + course + "입니다.");
    }

    // 메소드를 오버로딩하기
    public void show()
    {
        System.out.println("레이싱 카의 차량 번호는 " + num + "입니다.");
        System.out.println("연료 양은 " + gas + "입니다.");
        System.out.println("코스 번호는" + course + "입니다.");
    }
    
}

public class Inheritance {
    public static void main(String[] args)
    {
        /* 서브 클래스의 객체 생성하기
        RacingCar rccar1;
        rccar1 = new RacingCar();

        rccar1.setCar(1234, 20.5);
        rccar1.setCourse(5);*/

        // super()를 호출하기
        // RacingCar rccar1 = new RacingCar(1234, 20.5, 5);

        RacingCar rccar1;
        rccar1 = new RacingCar();

        rccar1.newShow();
        rccar1.show();

        // 슈퍼 클래스 변수 사용하기
        Car car1;
        car1 = new RacingCar();
        car1.setCar(1234, 20.5);
        car1.show();

        // 슈퍼 클래스 배열 사용하기
        Car[] cars;
        cars = new Car[2];

        cars[0] = new Car();
        cars[0].setCar(1234, 20.5);

        cars[1] = new RacingCar();
        cars[1].setCar(4567, 30.5);

        for(int i=0; i<cars.length; i++){
            cars[i].show();
        }
    }
}
