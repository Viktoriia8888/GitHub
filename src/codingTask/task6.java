package codingTask;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=scanner.nextInt();
        for (int i=2;i<=num;i++){
            if(num % i==0&&  num!=i){
                System.out.println(num+" is not a Prime");
                break;
            }else if( i==num){
                System.out.println(num+ "is a Prime number");
            }
        }
    }
}
