package Lesson14;

import java.io.*;

public class CommandLineArguments {
    public static void main(String[] args)
    {
        if(args.length != 1){
            System.out.println("올바른 파일 이름을 입력하십시오.");
            System.exit(1);
        }
        try{
            BufferedReader br3 = new BufferedReader(new FileReader(args[0]));

            String str4;
            while((str4 = br3.readLine()) != null){
                System.out.println(str4);
            }

            br3.close();
        }
        
        catch(IOException e){
            System.out.println("입출력 에러가 발생했습니다.");
        }
    }
}
