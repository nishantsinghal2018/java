import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string");

        String input = sc.nextLine();

        System.out.println(input);

        String str = input;
        String[] myString = str.split(" ");
        int length = str.length();
        System.out.println(length);
    }
}
