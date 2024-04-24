import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {
        System.out.println("Enter the String:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // welcome to my program
        int count = 1;

        for (int i = 0; i <= s.length() - 1; i++) {
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
                ;
            {
                count++;
            }

        }

        System.out.println("number of word in a string: " + count);

        // s.charAt(i)=' ' && a.charAt(i+1)!=''
        // int count=1;

    }
}
