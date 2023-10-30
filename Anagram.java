import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the 1st String");
     String str1=sc.nextLine();
     System.out.println("Enter the 2nd String");
     String str2=sc.nextLine();
    int c=0;
    char arr1[str1.length()];
    char arr2[str2.length()];
     if(str1.length()==str2.length())
     {
         for(int i=0;i<str1.length();i++)
         {
           arr1[i]=str1.charAt(i);

         }
         for(int j=0;j<str2.length();j++)
         {

           arr2[i]=str1.charAt(i);

         } 
    }
         for( i=0;i<str1.length();i++)
         {
            for(j=0;j<str2.length();j++)
            {
                if(arr1[i]==arr2[j])
                {
                    c++; 
                }
            }
         }
         System.out.println(c);
         if(str1.length()==c)
         {
         System.out.println("Strings are Anagram Strings");

        }
    }
    else
    {
        System.out.println("The String is Not Anagram String");
    }

        sc.close();


    }

}