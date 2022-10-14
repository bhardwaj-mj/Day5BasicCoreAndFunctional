package FunctionalPrograms;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a => ");
        double a= sc.nextDouble();
        System.out.print("Enter the value of b => ");
        double b= sc.nextDouble();
        System.out.print("Enter the value of c => ");
        double c= sc.nextDouble();
        double delta=b*b-4.0*a*c;
        if(delta>=0.0){
            double root1=(-b+Math.sqrt(delta))/(2.0*a);
            double root2=(-b-Math.sqrt(delta))/(2.0*a);
            System.out.println("The roots are => "+root1+" and "+root2);
        }
        else{
         System.out.println("The roots are not real");
        }
    }
}
