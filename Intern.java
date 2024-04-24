public class Intern {

    public static void main(String[] args) {
        String str1 = new String("Welcome to tutorials");
        String str2 = new String("Welcome to tutorials of strring");

        System.out.print("canonical representation:");
        System.out.println(str1.intern());

        System.out.print("canonical representation:");
        System.out.println(str2.intern());
    }
}