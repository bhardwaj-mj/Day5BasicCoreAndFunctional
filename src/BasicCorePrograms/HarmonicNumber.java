package BasicCorePrograms;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the harmonic value ");
        float harmonicValue= sc.nextFloat();
        float i;
        float harmonicNumber=0.0f;
        for(i=1;i<=harmonicValue;i++){
            float temp=1/i;
            harmonicNumber=temp+harmonicNumber;
        }
        System.out.println("Nth Harmonic number is "+harmonicNumber);
    }
}
