package BasicCorePrograms;

import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the alphabet ");
        char alphabet=sc.next().charAt(0);
        switch(alphabet){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(alphabet+" is a vowel");
                break;
            default:
                System.out.println(alphabet+" is a consonant");
        }
    }
}
