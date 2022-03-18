package book;
import java.io.*;

public class Sample7 {
    public static void main(String[] args) throws IOException{

    // 배열을 사용하기
    int[] test;
    test = new int[5];

    test[0] = 80;
    test[1] = 60;
    test[2] = 22;
    test[3] = 50;
    test[4] = 75;

    for(int i=0;i<5;i++){
        System.out.println((i + 1) + "번째 사람의 점수는" + test[i] + "입니다.");
    }

    // 배열 요소의 개수를 입력하기
    System.out.println("시험 응시자 수를 입력하십시오.");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int num = Integer.parseInt(str);

    int[] test1;
    test1 = new int[num];
    
    System.out.println("시험 응시자 수 만큼 점수를 입력하십시오.");

    for(int i1=0;i1<num;i1++){
        str = br.readLine();
        int tmp = Integer.parseInt(str);
        test1[i1] = tmp;
    }

    for(int i1=0;i1<5;i1++){
        System.out.println((i1 + 1) + "번째 사람의 점수는" + test[i1] + "입니다.");
    }

    // 배열의 선언과 생성을 동시에 하기
    int[] test2 = new int[5];

    test2[0] = 80;
    test2[1] = 60;
    test2[2] = 22;
    test2[3] = 50;
    test2[4] = 75;

    for(int i2=0;i2<5;i2++){
        System.out.println((i2 + 1) + "번째 사람의 점수는" + test2[i2] + "입니다.");
    }

    // 배열 변수에 배열을 대입하기
    int[] test3;
    test3 = new int[3];

    System.out.println("test3을 선언했습니다.");
    System.out.println("배열 요소를 생성했습니다.");

    test3 [0] = 80;
    test3 [1] = 60;
    test3 [2] = 22;

    int[] test4;
    System.out.println("test4를 선언했습니다.");

    test4 = test3;
    System.out.println("test4에 test3을 대입했습니다.");

    for(int i3=0;i3<3;i3++)
    {
        System.out.println("test3(이)가 가리키는" + (i3 + 1) + "번째 사람의 점수는" + test3[i3] + "입니다.");
    }

    for(int i3=0;i3<3;i3++)
    {
        System.out.println("test4(이)가 가리키는" + (i3 + 1) + "번째 사람의 점수는" + test4[i3] + "입니다.");
    }

    // 배열요소의 값 바꾸기
    int[] test5;
    test5 = new int[3];
    System.out.println("test5을 선언했습니다.");
    System.out.println("배열을 생성했습니다.");

    test5 [0] = 80;
    test5 [1] = 60;
    test5 [2] = 22;

    int[] test6;
    System.out.println("test6를 선언했습니다.");

    test6 = test5;
    System.out.println("test6에 test5을 대입했습니다.");

    for(int i4=0;i4<3;i4++)
    {
        System.out.println("test5가 가리키는" + (i4 + 1) + "번째 사람의 점수는" + test5[i4] + "입니다");
    }

    for(int i4=0;i4<3;i4++)
    {
        System.out.println("test6가 가리키는" + (i4 + 1) + "번째 사람의 점수는" + test6[i4] + "입니다");
    }

    test5[2] = 100;
    System.out.println("test5이 가리키는 세 번째 사람의 점수를 변경합니다.");

    for(int i4=0;i4<3;i4++)
    {
        System.out.println("test5가 가리키는" + (i4 + 1) + "번째 사람의 점수는" + test5[i4] + "입니다");
    }

    for(int i4=0;i4<3;i4++)
    {
        System.out.println("test6가 가리키는" + (i4 + 1) + "번째 사람의 점수는" + test6[i4] + "입니다");
    }

    // 배열의 길이를 알아내기
    int[] test7 = {80, 60, 22, 50, 75};

    for(int i5=0;i5<5;i5++)
    {
        System.out.println("test7가 가리키는" + (i5 + 1) + "번째 사람의 점수는" + test7[i5] + "입니다");
    }

    System.out.println("시험의 응시자 수는"  + test7.length + "명 입니다.");

    // 반복 조건에 배열의 길이를 지정하기
    int[] test8 = {80, 60, 22, 50, 75};

    for(int i5=0;i5<test8.length;i5++)
    {
        System.out.println("test8가 가리키는" + (i5 + 1) + "번째 사람의 점수는" + test8[i5] + "입니다");
    }

    System.out.println("시험의 응시자 수는"  + test8.length + "명 입니다.");

    // 배열을 정렬하기
    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

    int[] test9 = new int[5];
    System.out.println(test9.length + "명의 점수를 입력하십시오.");
    for(int i6=0;i6<test.length;i6++){
        String str1 = br1.readLine();
        test9[i6] = Integer.parseInt(str1);
    }

    for(int s=0;s<test.length;s++){
        for(int t=s+1;t<test.length;t++){
            if(test9[t] > test9[s]){
                int tmp = test[t];
                test[t] = test[s];
                test[s] = tmp;
            }
        }
    }

    for(int i5=0;i5<test9.length;i5++)
    {
        System.out.println("test9가 가리키는" + (i5 + 1) + "번째 사람의 점수는" + test9[i5] + "입니다");
    }

    // 다차원 배열을 사용하기
    int[][] test10;
    test10 = new int[2][5];

    test10[0][0] = 80;
    test10[0][1] = 60;
    test10[0][2] = 22;
    test10[0][3] = 50;
    test10[0][4] = 75;
    test10[1][0] = 90;
    test10[1][1] = 55;
    test10[1][2] = 68;
    test10[1][3] = 72;
    test10[1][4] = 58;

    for(int i=0;i<5;i++)
    {
        System.out.println((i+1) + "번째 사람의 국어 점수는" + test10[0][i] + "입니다.");
        System.out.println((i+1) + "번째 사람의 수학 점수는" + test10[1][i] + "입니다.");
    }

    // 길이가 일정하지 않은 다차원 배열
    int [][] test11 = {{80, 60, 22, 50}, {90, 55, 68, 72}, {33, 75, 63}};

    for(int i=0;i<test11.length;i++){
        System.out.println((i+1) + "번째 요소의 길이는" + test11[i].length + "입니다.");
    }

    // 연습문제 4
    System.out.println("5명의 시험 점수를 입력하십시오.");
    BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

    int[] test12 = new int[5];
    
    for(int i=0;i<5;i++){ 
        String str2 = br2.readLine();
        int tmp1 = Integer.parseInt(str2);
        test12[i] = tmp1;
    }

    int max = 0;
    for(int i=0;i<test12.length;i++)
    {
        if(max < test12[i]){
            max = test12[i];
        }
    }

    for(int i=0;i<test12.length;i++){
        System.out.println((i+1) + "번째 사람의 점수는" + test12[i] + "입니다.");
    }

    System.out.println("최고점수는" + max + "점 입니다.");

  } 
}
