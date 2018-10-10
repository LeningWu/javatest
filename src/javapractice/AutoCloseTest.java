/*package javapractice;

import java.io.*;

public class AutoCloseTest {
    public static void main(String[] args){
        throws IOException{
            try(
            //声明初始化两个可关闭的资源
            //try语句会自动关闭这两个资源
            BufferedReader br=new BufferedReader(new FileReader("AutoCloseTest.java"));
            PrintStream ps=new PrintStream(new FileOutputStream("a.txt")))
            {
                System.out.println(br.readLine());
                ps.println("qwert");
            }
        }
    }
}*/
