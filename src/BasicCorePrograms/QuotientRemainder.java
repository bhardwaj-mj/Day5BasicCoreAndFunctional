package BasicCorePrograms;

import java.util.Scanner;

public class QuotientRemainder {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ");
        int number= sc.nextInt();
        int Remainder=number%10;
        int Quotient=number/10;
        System.out.println("Remainder is "+Remainder);
        System.out.println("Quotient is "+Quotient);
    }
}
