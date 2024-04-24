import java.util.Scanner;

public class NumberN {
    public static void main(String[] arge) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int n = sc.nextInt();
        System.out.println("I like Coffee, and I like Tea: ");

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.print("like Coffee");
            } else if (i % 3 == 0) {

                System.out.print("I like Coffee");
            }

            else if (i % 5 == 0) {
                System.out.print("I like Tea");
            } else {

                System.out.print(i);
            }

            System.out.print("," + " ");
        }

        sc.close();
    }

}
