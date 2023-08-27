package codingTask;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int [] num={a,b};
        a=num[1];
        b=num[0];
        System.out.println(a+" "+b);
    }

}
