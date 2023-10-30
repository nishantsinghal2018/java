import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        System.out.println(" \n\n hey user welcome to atm machine");

        System.out.println("1:Balance Check \n 2:Deposit Money \n 3:Withdraw Money \n 4:EXIT");
        double amt=1000.0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Kindly choose your choice:");
        int ch=scan.nextInt();

        switch(ch)
        {
            case 1:
            {

                System.out.println("You choose for 'Balance Check'\n The amount in Your account is:" + amt);
                break;
            }
            case 2:
            { 
                System.out.println("You choose for 'Deposit Money'\n Enter your amount that you want to deposit:");
                double newamt=scan.nextDouble();
                amt+=newamt;
                System.out.println("Now the updated amount in your account is:"+amt);
            break;
            }
            case 3:
            {
                System.out.println("You choose for 'Withdrawn Money'..\n Enter the amount you want to withdrawn:");
                double wdamt=scan.nextDouble();
                if(wdamt > amt)
                {
                    System.out.println("Your enter invalid amount which is more than your account balance..");
                }
                else
                {
                    System.out.println("your Balance in account after withdrawn:"+(amt-=wdamt));
                }
                break;
            }
            case 4:
            {
                System.exit(1);

            }
            default:System.out.println("You enter Invalid Input");



        }
        scan.close();



    }

}
 