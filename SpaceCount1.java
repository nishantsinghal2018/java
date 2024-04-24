
import java.util.Scanner;

public class SpaceCount1 {
    public static void main(String[] arge) {
        // variable declaration
        String str;
        int space = 0;
        // vriable declaration and initialization
        Scanner scan = new Scanner(System.in);
        // create a scanner object for input

        System.out.println("Enter the String  ");
        str = scan.nextLine();
        for (int i = 0; i <= str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                space++;
            }
        }
        System.out.println("Total white space : " + space);
    }

}
