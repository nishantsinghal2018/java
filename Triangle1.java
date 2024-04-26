import java.util.Scanner;

public class Triangle1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the number of rows from the user
        System.out.print("Enter the number of rows for the triangle: ");
        int numRows = scanner.nextInt();
        // Nested loop to print the triangle pattern
        for (int i = 1; i <= numRows; i++) {<br>            // Inner loop to print '*' characters in each row
            for (int j = 1; j <= i; j++) {<br>            
                    System.out.print("appsquadz");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
        scanner.close();
    }
}
