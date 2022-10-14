package FunctionalPrograms;

import java.util.Scanner;

public class Distance {

    static void dis(double x,double y){
        double dist=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println("Distance from ("+x+" "+y+") to (0,0)=> "+dist);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of x ");
        double x= sc.nextDouble();
        System.out.print("Enter value of y ");
        double y= sc.nextDouble();
        dis(x,y);
    }
}
