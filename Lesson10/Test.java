package Lesson10;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
		// 연습문제 2
		System.out.println("문자열을 입력하십시오.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		StringBuffer str2 = new StringBuffer(str1);
		str2.reverse();
		System.out.println(str1 + "를 거꾸로 읽으면 " + str2 + "입니다.");
		
		// 연습문제 3
		System.out.println("문자열을 입력하십시오.");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		String str3 = br1.readLine();
		System.out.println("a가 들어갈 위치를 정수로 입력하십시오.");

        String str4 = br1.readLine();
        int num = Integer.parseInt(str4);
        StringBuffer str5 = new StringBuffer(str3);
        str5.insert(num, 'a');

        System.out.println(str5 + "이 되었습니다.");

        // 연습문제 4
        System.out.println("정수를 2개 입력하십시오.");

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        String str6 = br2.readLine();
        String str7 = br2.readLine();

        int num1 = Integer.parseInt(str6);
        int num2 = Integer.parseInt(str7);

        int ans = Math.min(num1, num2);
        System.out.println(num1 + "와(과) " + num2 + "중 작은 쪽은 " + ans + "입니다.");
    }
}
