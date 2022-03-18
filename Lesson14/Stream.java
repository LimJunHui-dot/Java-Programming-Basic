package Lesson14;

import java.io.*;

public class Stream {
    public static void main(String[] args)
    {
        System.out.println("문자열을 입력하시오.");

        // 화면과 키보드로 입력하고 출력하기
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test1.txt")));
            BufferedReader br1 = new BufferedReader(new FileReader("test1.txt"));
            
            String str1 = br1.readLine();
            String str2 = br1.readLine();

            System.out.println("파일에 기록된 2개의 문자열은");
            System.out.println(str1 + "입니다.");
            System.out.println(str2 + "입니다.");

            br1.close();

            pw.println("Hello");
            pw.println("GoodBye!");
            System.out.println("파일에 기록되었습니다.");

            pw.close();

            String str = br.readLine();
            System.out.println(str + "(이)가 입력되었습니다.");
        }
        catch(IOException e){
            System.out.println("입출력 에러가 발생했습니다.");
        }
    }
}
