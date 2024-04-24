public class AllTrim {
    private static final String EMPTY_STRING = "";

    public static String ltrim(String str) {
        return str.replaceAll("^\\s+", EMPTY_STRING);
    }

    public static String rtrim(String str) {
        return str.replaceAll("\\s+$", EMPTY_STRING);
    }

    public static void main(String[] args) {
        String str = "  Hello World  ";

        System.out.println("Left Trim :" + ltrim(str) + ":");
        System.out.println("Right Trim :" + rtrim(str) + ":");
    }

}
