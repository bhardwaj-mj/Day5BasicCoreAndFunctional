package BasicCorePrograms;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the power value ");
        double n= sc.nextDouble();
        double number=2;
        double table=0.0;
        System.out.println("Table of powers of two is ");
        for(double i=1;i<=n;i++){
            table=Math.pow(number,i);
            System.out.println(table);
        }
    }
}
