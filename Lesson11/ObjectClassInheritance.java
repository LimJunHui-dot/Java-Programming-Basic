package Lesson11;

public class ObjectClassInheritance {
    public static void main(String[] args)
    {
        Car car1 = new Car();
        Car car2 = new Car();

        Car car3;
        car3 = car1;

        // equals() 메소드 이용하기
        boolean b11 = car1.equals(car2);
        boolean b12 = car1.equals(car3);

        System.out.println("car1과 car2가 같은지 조사한 결과," 
                            + b11 + "였습니다.");
        System.out.println("car1과 car3이 같은지 조사한 결과,"
                            + b12 + "였습니다.");      
        car1.setCar(1234, 20.5);

        System.out.println(car1);

        // getClass() 메소드 사용하기
        Car[] cars;
        cars = new Car[2];

        cars[0] = new Car();
        cars[1] = new RacingCar();

        for(int i=0; i<cars.length; i++){
            Class c1 = cars[i].getClass();
            System.out.println((i + 1) + "번째 객체의 클래스는" + c1 + "입니다.");
        }
    }
}
