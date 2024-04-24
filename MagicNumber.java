import java.util.Scanner;

public class MagicNumber {
    public static int getSumOfDigits(int number) {
        int sumOfDigits = 0;
        while (number != 0) {
            sumOfDigits = sumOfDigits + (number % 10);
            number = number / 10;
        }
        return sumOfDigits;
    }

    public static void main(String args[]) {

        System.out.println("Enter the number .");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int savedNumber = number;

        while (number > 9) // while the number is more than 1 digit long.
        {
            number = getSumOfDigits(number); // recursively sum the digits of the number.
        }

        if (number == 1) {
            System.out.println(savedNumber + " is a Magic Number.");
        } else {
            System.out.println(savedNumber + " is NOT a Magic number.");
        }
    }

}
