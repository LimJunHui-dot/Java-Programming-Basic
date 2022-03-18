package book;

import java.io.*;

public class Sample4 {
    
    public static void main(String[] args) throws IOException
    {
        // 식의 값을 출력하기
        System.out.println("1+2는" +(1+2)+ "입니다.");
        System.out.println("3*4는" +(3*4)+ "입니다.");

        // 변수의 값을 사용하기
        int num1 = 2;
        int num2 = 3;
        int sum = num1 + num2;
        System.out.println("변수 num1의 값은" + num1 + "입니다.");
        System.out.println("변수 num2의 값은" + num2 + "입니다.");
        System.out.println("변수 sum의 값은" + sum + "입니다.");

        num1 = num1 + 1;

        System.out.println("변수 num1의 값에 1을 더하면" + num1 + "입니다.");

        // 덧셈 프로그램
        System.out.println("정수를 2개 입력하십시오.");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int num3 = Integer.parseInt(str1);
        int num4 = Integer.parseInt(str2);

        System.out.println("덧셈의 결과는" + (num3 + num4) + "입니다.");

        // 다양한 연산자를 사용해 보기
        int num5 = 10;
        int num6 = 5;

        System.out.println("num5과 num6로 다양한 연산을 수행합니다.");
        System.out.println("num5 + num6는" + (num5 + num6) + "입니다.");
        System.out.println("num5 - num6는" + (num5 - num6) + "입니다.");
        System.out.println("num5 * num6는" + (num5 * num6) + "입니다.");
        System.out.println("num5 / num6는" + (num5 / num6) + "입니다.");
        System.out.println("num5 % num6는" + (num5 % num6) + "입니다.");

        // 전위, 후위 증가 연산자 사용하기
        int a = 0;
        int b = 0;

        b = a++;

        System.out.println("대입 후에 증가 연산자를 사용했습니다. b의 값은" + b + "입니다.");

        // 복합 대입 연산자
        System.out.println("정수를 3개 입력하십시오.");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        String str3 = br1.readLine();
        String str4 = br1.readLine();
        String str5 = br1.readLine();

        int sum1 = 0;
        sum1 += Integer.parseInt(str3);
        sum1 += Integer.parseInt(str4);
        sum1 += Integer.parseInt(str5);

        System.out.println("3개 정수의 합은" + sum1 + "입니다.");

        // 큰 사이즈의 형에 대입하기
        int inum = 160;

        System.out.println("키는" + inum + "센티미터입니다.");

        System.out.println("double형 변수에 대입합니다.");
        double dnum = inum;

        System.out.println("키는" + dnum + "센티미터입니다.");

        // 작은 데이터형 변수에 대입하기
        double dnum1 = 160.5;
        System.out.println("키는" + dnum1 + "센티미터입니다.");
        System.out.println("int형 변수에 대입합니다.");
        int inum1 = (int)dnum1;

        System.out.println("키는" + inum1 + "센티미터입니다.");

        // 다른 형의 변수와 연산하기
        int d = 2;
        double pi = 3.14;

        System.out.println("지름이" + d + "센티미터인 원의");
        System.out.println("둘레는" + (d * pi) + "센티미터 입니다.");

        // 같은 형의 변수와 연산하기
        int num7 = 5;
        int num8 = 4;
        
        double div = (double) num7 / (double) num8;

        System.out.println("5/4는" + div + "입니다.");

    }
}
