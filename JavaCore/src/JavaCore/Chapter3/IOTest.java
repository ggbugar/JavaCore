package JavaCore.Chapter3;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import sun.print.PrinterJobWrapper;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.*;
import java.nio.*;

public class IOTest {
    public static void main(String[] args) throws IOException {
        //Scanner in=new Scanner(System.in);
        //nextLine,next(下一个单词，以String返回),nextInt,nextDouble
        //int age =in.nextInt();
        //format output:printf()
        /**
         * printf("%-m.nf",f)
         * - 左对齐，+右对齐
         * m 输出m位
         * .n 小数点后n位
         * f 浮点数
         */
        //System.out.printf("age:%d",age);
        //use String.format if you don't want to print
        //String message=String.format("Hello,%s.Next year,you will be %d.",name,age+1);
        /*
        Scanner in=new Scanner(System.in);
        System.out.println("what's your name?");
        String name= in.next();
        System.out.println("how old are you?");
        int age=in.nextInt();
        String message=String.format("Hello,%s.Next year,you will be %d.",name,age+1);
        System.out.println(message);
        */

        //Reading from a file
        Scanner readFile=new Scanner(Paths.get("myfile.txt"),"UTF-8");
        //Writing to a file
        PrintWriter writeFile=new PrintWriter("myfile.txt","UTF-8");
        writeFile.println("written");
    }

}
