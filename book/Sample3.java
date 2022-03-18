package book;

import java.io. *;

public class Sample3 {
    public static void main(String[] args) throws IOException
    {
        // 변수를 사용하기
        int num;

        num = 3;

        System.out.println("변수 num의 값은" + num + "입니다.");

        // 변수의 값을 바꾸기
        num = 5;
        System.out.println("변수 num의 값을 변경했습니다.");
        System.out.println("변수 num의 값은" + num + "입니다.");

        // 다른 변수에 값을 대입하기
        int num1, num2;
        num1 = 3;
        System.out.println("변수 num의 값은" + num1 + "입니다.");

        num2 = num1;

        System.out.println("변수 num1의 값을 변수 num2에 대입했습니다.");
        System.out.println("변수 num의 값은" + num2 + "입니다.");

        //키보드로 입력하기
        System.out.println("문자열을 입력하십시오.");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(str + "(이)가 입력되었습니다.");

        // 숫자를 입력하기
        System.out.println("정수를 입력하십시오.");

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br1.readLine();

        int num3 = Integer.parseInt(str1);

        System.out.println(num3 + "(이)가 입력되었습니다.");

        // 2개 이상의 숫자를 연속해서 입력받기
        System.out.println("정수를 2개 입력하십시오.");

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        String str2 = br2.readLine();
        String str3 = br2.readLine();

        int num4 = Integer.parseInt(str2);
        int num5 = Integer.parseInt(str3);

        System.out.println("먼저" + num4 + "(이)가 입력되었습니다.");
        System.out.println("그 다음으로" + num5 + "(이)가 입력되었습니다.");

        // 연습문제 3
        System.out.println("당신은 몇 살입니까?");

        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));

        String str4 = br3.readLine();

        int num6 = Integer.parseInt(str4);

        System.out.println("당신은" + num6 + "살입니다.");

        // 연습문제 4
        System.out.println("원주율의 값은 얼마입니까?");

        BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));

        String str5 = br4.readLine();

        Double num7 = Double.parseDouble(str5);

        System.out.println("원주율의 값은" + num7 + "입니다.");

        // 연습문제 5
        System.out.println("키와 몸무게를 입력하십시오.");

        BufferedReader br5 = new BufferedReader(new InputStreamReader(System.in));

        String str6 = br5.readLine();
        String str7 = br5.readLine();

        Double num8 = Double.parseDouble(str6);
        Double num9 = Double.parseDouble(str7);

        System.out.println("키는" + num8 + "센티미터입니다.");
        System.out.println("몸무게는" + num9 + "킬로그램입니다.");

    }
    
}
