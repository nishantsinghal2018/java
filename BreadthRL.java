
import java.util.Scanner;

public class BreadthRL {
    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);

        System.out.println("Enter the length & width of the rectangle::\n");

        // Reading data using readLine
        float l = in.nextFloat();
        float w = in.nextFloat();
        float p;

        /* Calculate perimeter of rectangle */
    	p = 2 * (l + w);

        System.out.print("\n");
        System.out.println("The Perimeter of rectangle = " + p + " units");
    }
    
}
