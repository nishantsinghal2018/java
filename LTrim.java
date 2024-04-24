public class LTrim {
    private static final String EMPTY_STRING = "";

    public static String ltrim(String str) {
        return str.replaceAll("^\\s+", EMPTY_STRING);
    }

    public static void main(String[] args) {
        String str = "  Hello World  ";

        System.out.println("Left Trim :" + ltrim(str) + ":");
        

}
