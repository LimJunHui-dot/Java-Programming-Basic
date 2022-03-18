package Lesson15;

// 스레드 기동시키기
class Car extends Thread
{
    private String name;

    public Car(String nm)
    {
        name = nm;
    }

    public void run() throws InterruptedException
    {
        for(int i=0; i < 5; i++)
        {
            sleep(1000);
            System.out.println(name + "가 동작하고 있습니다.");
            
        }
    }

    private void sleep(int i) {
    }
}

public class Thread {
    public static void main(String[] args) throws InterruptedException
    {
        Car car1 = new Car("1호차");
        car1.run();

        Car car2 = new Car("2호차");
        car2.run();

        for(int i = 0; i < 5; i++){
            System.out.println("main() 메소드가 실행중입니다.");
        }
    }
}
