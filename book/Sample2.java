package book;

public class Sample2 {
    public static  void main(String [] args)
    {
        // 화면에 문자열 출력하기
        System.out.println("Java 세상에 오신 것을 환영합니다!");
        System.out.println("Java를 시작합니다.");

        // print를 사용
        System.out.print("Java 세상에 오신 것을 환영합니다!");
        System.out.print("Java를 시작합니다.");

        // 다양한 값을 출력하기
        System.out.println('A');
        System.out.println(123);

        // 이스케이프 시퀀스 사용하기
        System.out.println("원화 기호를 표시합니다. : \\");
        System.out.println("작은 따옴표를 표시합니다. : \'");

        // 문자 코드 사용하기
        System.out.println("8진수 101은 \101입니다.");
        System.out.println("16진수 0061은 \u0061입니다.");

        // 10진수 이외의 표기법으로 표기하기
        System.out.println("10진수 10은" + 10 + "입니다.");
        System.out.println("8진수 10은" + 010 + "입니다.");
        System.out.println("16진수 10은" + 0x10 + "입니다.");
        System.out.println("16진수 F은" + 0xF + "입니다.");

        // 연습문제 3
        System.out.println(123);
        System.out.println("\\100 받았다");
        System.out.println("내일 또 만나요");

        // 연습문제 4
        System.out.println("1\t2\t3");

        // 연습문제 5
        //8진수
        System.out.println(06);
        System.out.println(024);
        System.out.println(015);

        //16진수
        System.out.println(0x6);
        System.out.println(0x14);
        System.out.println(0xD);

    }

}
