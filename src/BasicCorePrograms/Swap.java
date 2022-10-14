package BasicCorePrograms;

import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number1 ");
        int number1= sc.nextInt();
        System.out.print("Enter number2 ");
        int number2= sc.nextInt();
        System.out.println("Before swap number are "+number1+" "+number2);
        number1=number1+number2;
        number2=number1-number2;
        number1=number1-number2;
        System.out.println("After swap numbers are  "+number1+" "+number2);
    }
}
