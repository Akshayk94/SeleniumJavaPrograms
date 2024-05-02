package test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter no to create series");
        int no= sc1.nextInt();
        /* Approach-1
        int firstNumber=0;
        int secondNumber=1;
        for (int a=1;a<=no;a++){
            System.out.print(firstNumber+",");
            int nextNo=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=nextNo;
        }*/

        int[] fib=new int[no];
        fib[0]=0;
        fib[1]=1;
        for (int a=2;a<no;a++){
            fib[a]=fib[a-1]+fib[a-2];
        }
        for (int i:fib){
            System.out.print(i+",");
        }
    }
}
