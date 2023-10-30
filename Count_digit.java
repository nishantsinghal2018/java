import java.util.Scanner;

public class Count_digit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("USER: Enter the number");
        int num=scan.nextInt();
        int c=0;

        while(num>0)
        {
           int m=num%10;
            num=num/10;
            c++;


        }
        System.out.println("The Number your entered  is of Digit: "+ c);
        scan.close();



    }

}