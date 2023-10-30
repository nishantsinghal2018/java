
import java.util.Scanner;
public class Month {
    public static void main(String[]args){
         System.out.println("Enter the month: ");  
         Scanner sc=new Scanner(System.in);
        int sf=sc.nextInt();  
        switch(sf){
         case 1:

             System.out.println("Winter");
             break;
        case 2:

             System.out.println("Spring");
             break;
        case 3:
        case 4:
        case 5:
            System.out.println("Summer");
            break;
        case 6:
        case 7:
        case 8:
        case 9: 
            System.out.println("Moonsoon");
            break;
        case 10:    
        case 11:
        case 12:
         System.out.println("Winter");
            break;
        default:
           System.out.println("invalid input");
          }
        sc.close();



        }
    }