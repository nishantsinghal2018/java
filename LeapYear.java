import java.util.Scanner;


public class LeapYear {
    public static void main(String[] args) {
        Scanner year=new Scanner(System.in);
        System.out.println("Enter the year");

      int yr=year.nextInt();
        if(yr%100==0 && yr%400==0)
         {
           System.out.println("yes "+ yr +" yes it is an leap year");
        }
        else if(yr%4==0)
          {
            System.out.println("yes "+ yr +"  year is leap year..");

          }
        else
        {
          System.out.println("NO "+ yr + " this year is not an leap year..");}


        year.close();
    }
  }