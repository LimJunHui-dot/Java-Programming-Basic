package Lesson14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LargeData {
    public static void main(String[] args)
    {
        // 파일로 입력하기
        try{
            BufferedReader br2 = new BufferedReader(new FileReader("test2.txt"));

            int[] test = new int[8];
            String str3;

            for(int i = 0; i < test.length; i++)
            {
                str3 = br2.readLine();
                test[i] = Integer.parseInt(str3);
            }

            int max = test[0];
            int min = test[0];
            for(int i = 0; i < test.length; i++)
            {
                if(max < test[i])
                    max = test[i];
                if(min > test[i])
                    min = test[i];
                System.out.println(test[i]);
            }

            System.out.println("최고 점수는" + max + "입니다.");
            System.out.println("최저 점수는" + min + "입니다.");
            
            br2.close();
        }
        catch(IOException e1){
            System.out.println("입출력 에러가 발생하였습니다.");
        }
    }
}
