package Lesson10;

import java.io.*;

public class ClassLibrary {
    public static void main(String[] args) throws IOException {
		// 문자열의 길이를 알아내고 문자열에서 문자를 호출하기
		String str = "Hello";
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		int len = str.length();
		System.out.println(str + "의 첫 번째 문자는 " + ch1 + " 입니다.");
		System.out.println(str + "의 두 번째 문자는 " + ch2 + " 입니다.");
		System.out.println(str + "의 길이는 " + len + " 입니다.");
		
		// 대문자와 소문자를 변환하기
		System.out.println("영문자를 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		
		String stru = str1.toUpperCase();
		String str2 = str1.toLowerCase();
		
		System.out.println("대문자로 변환하면 " + stru + " 입니다.");
		System.out.println("소문자로 변환하면 " + str2 + " 입니다.");
		
		// 문자를 검색하기
		System.out.println("문자열을 입력하십시오.");
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		String str3 = br1.readLine();
		
		System.out.println("안녕하십니까. 검색어를 입력하십시오.");
		
		String str4 = br1.readLine();
		char ch3 = str4.charAt(0);
		
		int num = str3.indexOf(ch3);
		
		if(num != -1)
		{
			System.out.println(str3 + "의 " + (num+1) + "번째에서 '" + ch3 + "'을(를) 발견했습니다.");
		}
		else {
			System.out.println(str3 + "에서 '" + ch3 + "'을(를) 찾을 수 없었습니다.");
		}
		
		// 문자열을 추가하기
		System.out.println("문자열을 입력하십시오.");
		
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		String str5 = br2.readLine();
		
		System.out.println("추가할 문자열을 입력하십시오.");
		
		String str6 = br2.readLine();
		
		StringBuffer sb = new StringBuffer(str5);
		sb.append(str6);
		
		System.out.println(str5 + "에" + str6 + "을(를) 추가하면 " + sb + " 입니다.");
		
		// 최댓값 조사하기
		System.out.println("정수를 2개 입력하십시오.");
		
		BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
		
		String str7 = br3.readLine();
		String str8 = br3.readLine();
		
		int num1 = Integer.parseInt(str7);
		int num2 = Integer.parseInt(str8);
		
		int ans = Math.max(num1, num2);
		
		System.out.println(num1 + "와(과)" + num2 + "중 큰 쪽은" + ans + "입니다.");
	}
}
