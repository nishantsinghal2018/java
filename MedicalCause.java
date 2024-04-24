import java.util.Scanner;

public class MedicalCause {

    public static void main(String[] args) {
        // A student will not be allowed to sit in exam if his/her attendence is less
        // than 75%

        Scanner S = new Scanner(System.in);

        System.out.println("Enter number of class attendend");
        float Ca = S.nextFloat();

        System.out.println("Enter number of class held");
        float Ch = S.nextFloat();

        System.out.println("Did student have any medical cause \"true or false?\"");
        boolean medical = S.nextBoolean();

        if (Ca / Ch * 100 > 75) {
            System.out.println("You are allowed to sit in exam with " + Ca / Ch * 100 + " Percentage of attendence");
        }

        if (medical) {
            System.out.println("You are allowed to sit in exam with " + Ca / Ch * 100 + " Percentage of attendence");
        }

        else {
            System.out
                    .println("You are not allowed to sit in exam with " + Ca / Ch * 100 + " Percentage of attendance");
        }

    }
}
