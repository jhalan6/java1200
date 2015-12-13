package csh.java1200.u02basic.demo021;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Created by Alan on 15/12/12.
 */
public class LogOutput {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out=System.out;
        PrintStream printStream=new PrintStream("/tmp/LogOutput.log");
        System.setOut(printStream);
        System.out.println("这句话写在log文件中");
        out.println("这句话写在控制台");
        new Test();
    }
}
