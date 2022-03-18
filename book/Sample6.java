package book;
import java.io.*;

public class Sample6 {
    public static void main(String[] args) throws IOException
    {
        // for 문을 사용하기
        for(int i=1;i<=5;i++){
            System.out.println("반복하고 있습니다.");
        }
        System.out.println("반복이 끝났습니다.");

        // 반복 횟수를 출력하기
        for(int i=1;i<=5;i++){
            System.out.println(i + "번째 반복입니다.");
        }
        System.out.println("반복이 끝났습니다.");
        
        // 입력한 수만큼 *를 출력하기
        System.out.println("몇 개의 *를 출력 하시겠습니까?");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);

        for(int i=1; i<=num;i++)
        {
            System.out.print("*");
        }

        // 1부터 입력한 숫자까지의 합을 구하기
        System.out.println("숫자 몇까지의 합을 구하시겠습니까?");

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br1.readLine();
        int num1 = Integer.parseInt(str1);

        int sum = 0;
        for(int i1=1;i1<=num1;i1++){
            sum += i1;
        }

        System.out.println("1부터" + num1 + "까지의 합은" + sum + "입니다.");

        // while 문을 사용하기
        int i2 = 1;

        while(i2 <= 5){
            System.out.println(i2 + "번째 반복입니다.");
            i2++;
        }

        System.out.println("반복이 끝났습니다.");

        // do ~ while 문 사용하기
        int i3 = 1;

        do{
            System.out.println(i3 + "번째 반복입니다.");
            i3++;
        }while(i3 <=5);

        System.out.println("반복이 끝났습니다.");

        // for 문 중첩하기
        for(int i4=0;i4<5;i4++){
            for(int j=0;j<3;j++){
                System.out.println("i4는" + i4 + ": j는" + j);
            }
        }

        // if 문 등과 조함하기
        boolean b1 = false;
        for(int i5=0;i5<5;i5++){
            for(int j1=0;j1<5;j1++){
                if(b1 == false){
                    System.out.print("*");
                    b1 = true;
                }
                else{
                    System.out.print("-");
                    b1 = false;
                }
            }
            System.out.print("\n");
           
        }

        // break 문으로 블록에서 빠져나가기
        System.out.println("몇 번째에서 루프를 빠져 나가시겠습니까?(1~10)");

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        String str2 = br2.readLine();
        int res = Integer.parseInt(str2);

        for(int i6=1;i6<=10;i6++){
            System.out.println(i6 +"번째 처리입니다.");
            if(i6==res)
                break;
        }
        
        // switch 문 안에서 break 문을 사용하기
        System.out.println("정수를 입력하십시오(1~5)");

        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));

        String str3 = br3.readLine();
        int res1 = Integer.parseInt(str3);

        switch(res1){
            case 1:
            case 2:
                System.out.println("조금 더 노력합시다");
                break;
            case 3:
            case 4:
                System.out.println("이 페이스로 더 노력합시다.");
                break;
            case 5:
                System.out.println("매우 우수합니다.");
                break;
            default:
                System.out.println("1~5까지의 성적을 입력하십시오.");
                break;
        }

        // continue 문으로 볼록 시작부분으로 돌아가기
        System.out.println("몇 번째 처리를 건너 뛰시겠습니까? (1 ~10)");

        BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));

        String str4 = br4.readLine();
        int res2 = Integer.parseInt(str4); 

        for(int i7=1;i7<=10;i7++)
        {
            if(i7 == res2){
                continue;
            }
            System.out.println(i7 + "번째 처리입니다.");
        }

        // 연습문제 1
        System.out.println("1 ~10까지의 짜수를 출력합니다.");

        for(int i8=1;i8<=10;i8++){
            if ((i8 % 2) == 0){
                System.out.println(i8);
            }
        }

        // 연습문제 2
        System.out.println("시험 점수를 입력하십시오. (0으로 종료)");

        BufferedReader br5 = new BufferedReader(new InputStreamReader(System.in));

        int num2 = 0;
        int sum1 = 0;

        do{
            String str5 = br5.readLine();
            num2 = Integer.parseInt(str5);
            sum1 += num2; 
        }while(num2 != 0);

        System.out.println("시험 점수의 합계는" + sum1 + "점입니다.");

        // 연습문제 3
        for(int i9=1;i9<=9;i9++)
        {
            for(int j2=1;j2<=9;j2++){
                System.out.print(i9*j2+ "\t");
            }
            System.out.print("\n");
        }

        // 연습문제 4
        for(int i10=1;i10<=5;i10++){
            for(int j3 =0;j3<i10;j3++){
                System.out.print("*");

            }
            
            System.out.print("\n");
        }

        // 연습문제 5
        System.out.println("2이상의 정수를 입력하십시오.");

        BufferedReader br6 = new BufferedReader(new InputStreamReader(System.in));

        String str6 = br6.readLine();
        int num3 = Integer.parseInt(str6);


        for(int i11 =2;i11<=num3;i11++){
            if (num3 == i11){
                System.out.println(i11+ "은 소수입니다.");
            }
            else if((num3 % i11) == 0)
            {
                System.out.println(i11 +"은 소수가 아닙니다.");
                break;
            }
        }
        




    }

}
