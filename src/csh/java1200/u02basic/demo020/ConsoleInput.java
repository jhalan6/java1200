package csh.java1200.u02basic.demo020;

import java.util.Scanner;

/**
 * Created by Alan on 15/12/12.
 */
public class ConsoleInput {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String temp;
        while ((temp=scanner.nextLine())!=null){
            System.out.println(temp);
        }
    }
}
