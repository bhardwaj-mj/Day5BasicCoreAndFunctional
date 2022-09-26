package BasicCorePrograms;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of times coin to be flipped ");
        int number= sc.nextInt();
        double countHeads=0;
        double countTails=0;
        for(int i=0;i<number;i++){
            double flipCoin=Math.random();
            if(flipCoin<0.5){
                countHeads++;
            }
            else{
                countTails++;
            }
        }
        System.out.println("Number of heads is "+countHeads);
        System.out.println("Number of tails is "+countTails);

        double heads=(countHeads/number)*100;
        double tails=(countTails/number)*100;

        System.out.println("Percentage of heads is "+heads);
        System.out.println("Percentage of tails is "+tails);
    }
}
