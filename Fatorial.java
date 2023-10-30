import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("User the number that you want to get the Factorial..");
        int num=scan.nextInt();
        int fact=1;
        int n=num;
         while(n>1)
        {
             fact*=n;
            n--;
        }


    System.out.println("The factorial of "+ num +" is: "+ fact );

        scan.close();
    }

}