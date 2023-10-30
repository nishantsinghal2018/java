import java.util.Scanner;

public class Calculator { 
    public static void main(String[] args) {
        System.out.println(" \n\n hey user welcome to 'Calculator':");

        System.out.println(" For\n 1: Addition(+) \n 2:Subtraction(-) \n 3:Multiply(x)\n 4:Divide(/) \n 5:Modulo Division(%)");
        System.out.println(" The Format is'Number1+Number2' ,  kindly enter the value carefully '");

        Scanner scan= new Scanner(System.in);
        System.out.println("Kindly choose your choice:");
        int ch=scan.nextInt();

        switch(ch)
        {
            case 1:
            {

                System.out.println("You choose for '+'\n Enter  your two numbers");
              float a=scan.nextFloat();
               float b=scan.nextFloat();   

                System.out.println("Your result:"+(a+b));

                break;
            }
            case 2:
            { 
                System.out.println("You choose for '-'\n Enter your Two numbers:");
              float a=scan.nextFloat();
               float b=scan.nextFloat();   



                System.out.println("Your result:"+(a-b));
                break;

            }
            case 3:
            {
                System.out.println("You choose for 'X'..\n Enter your Two numbers: ");
               float a=scan.nextFloat();
               float b=scan.nextFloat();

                System.out.println("Your result:"+(a*b));

                break;
            }

            case 4:
            {
                System.out.println("You choose for (/) \n Enter your Two numbers: ");
             float a=scan.nextFloat();
               float b=scan.nextFloat();

                System.out.println("Your result:"+(a/b));

                break;
            }
            case 5:
            {
                System.out.println("You choose for (%) \n Enter your Two numbers: ");
             float a=scan.nextFloat();
               float b=scan.nextFloat();

                System.out.println("Your result:"+(a%b));

                break;
            }
            default:System.out.println("You enter Invalid Input, Other than options");


        }
        scan.close();


}
}