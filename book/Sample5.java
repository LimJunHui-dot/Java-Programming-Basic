package book;
import java.io.*;

public class Sample5 {
    public static void main(String[] args) throws IOException
    {
        // if 문 사용하기
        System.out.println("정수를 입력하십시오.");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        if(res == 1){
            System.out.println("1이 입력되었습니다.");
        }
        System.out.println("처리를 종료합니다.");

        // 여러 개의 문장을 if 문 안에서 실행시키기
        System.out.println("정수를 입력하십시오.");

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br1.readLine();
        int res1 = Integer.parseInt(str1);
        if(res1 == 1){
            System.out.println("1이 입력되었습니다.");
            System.out.println("1이 선택되었습니다.");
        }
        System.out.println("처리를 종료합니다.");

        // if ~ else 문 사용하기
        System.out.println("정수를 입력하십시오.");

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        String str2 = br2.readLine();
        int res2 = Integer.parseInt(str2);

        if(res2 == 1){
            System.out.println("1이 입력되었습니다.");
        }
        else{
            System.out.println("1 이외의 값이 입력되었습니다.");
        }

        // if ~ else if ~ else 문 사용하기
        System.out.println("정수를 입력하십시오.");

        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));

        String str3 = br3.readLine();
        int res3 = Integer.parseInt(str3);

        if(res3 == 1){
            System.out.println("1이 입력되었습니다.");
        }
        else if(res3 == 2){
            System.out.println("1 이외의 값이 입력되었습니다.");
        }
        else{
            System.out.println("1 혹은 2를 입력하십시오.");
        }

        // switch 문 사용하기
        System.out.println("정수를 입력하십시오.");

        BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));

        String str4 = br4.readLine();
        int res4 = Integer.parseInt(str4);

        switch(res4){
            case 1:
                System.out.println("1이 입력되었습니다.");
                break;
            case 2:
                System.out.println("2가 입력되었습니다.");
                break;
            case 3:
                System.out.println("1 혹은 2를 입력하십시오");
                break;    
        }

        // switch 문에서 문자로 분기하기
        System.out.println("a 혹은 b를 입력하십시오.");

        BufferedReader br5 = new BufferedReader(new InputStreamReader(System.in));

        String str5 = br5.readLine();
        char res5 = str5.charAt(0);

        switch(res5){
            case 'a':
                System.out.println("a가 입력되었습니다.");
                break;
            case 'b':
                System.out.println("b가 입력되었습니다.");
                break;
            default :
                System.out.println("a 혹은 b를 입력하십시오");
                break;    
        }

        // 관계 연산자 사용하기
        System.out.println("몇 번째 코스를 선택 하시겠습니까?");
        System.out.println("정수를 입력하십시오.");

        BufferedReader br6 = new BufferedReader(new InputStreamReader(System.in));

        String str6 = br6.readLine();
        int res6 = Integer.parseInt(str6);

        char ans = (res6 == 1) ? 'A' : 'B';

        System.out.println(ans + "코스를 선택했습니다.");

        // 연습문제 2
        System.out.println("정수를 입력하십시오.");

        BufferedReader br7 = new BufferedReader(new InputStreamReader(System.in));

        String str7 = br7.readLine();
        int res7 = Integer.parseInt(str7);

        if ((res7 % 2) == 0 )
        {
            System.out.println(res7 + "은 짝수입니다.");
        }
        else{
            System.out.println(res7 + "은 홀수입니다.");
        }

        // 연습문제 3
        System.out.println("2개의 정수르 입력하십시오.");
        
        BufferedReader br8 = new BufferedReader(new InputStreamReader(System.in));

        String str8 = br8.readLine();
        String str9 = br8.readLine();

        int num8 = Integer.parseInt(str8);
        int num9 = Integer.parseInt(str9);

        if (num8 < num9)
        {
            System.out.println(num8 + "보다" + num9 + "이 큽니다");
        }
        else if (num8 > num9)
        {
            System.out.println(num9 + "보다" + num8 + "이 큽니다" );
        }
        else
        {
            System.out.println("두 숫자는 같습니다.");
        }

        // 연습문제 4
        System.out.println("0에서 10까지의 수를 입력하십시오.");

        BufferedReader br9 = new BufferedReader(new InputStreamReader(System.in));

        String str10 = br9.readLine();

        int num10 = Integer.parseInt(str10);

        if(num10 >= 0 && num10 <= 10)
        {
            System.out.println("정답입니다.");
        }
        else
        {
            System.out.println("오답입니다.");
        }

        // 연습문제 5
        System.out.println("정수를 입력하십시오.");

        BufferedReader br10 = new BufferedReader(new InputStreamReader(System.in));

        String str11 = br10.readLine();

        int num11 = Integer.parseInt(str11);

        switch(num11){
            case 1:
                System.out.println("노력합시다.");
                break;
            case 2:
                System.out.println("조금 더 노력합시다.");
                break;
            case 3:
                System.out.println("더 높은 점수를 목표로 합시다.");
                break;
            case 4:
                System.out.println("매우 잘했습니다.");
                break;
            case 5:
                System.out.println("매우 우수합니다.");    
                break;
        }



    }
}
