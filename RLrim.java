public class RLrim {
    private static final String EMPTY_STRING = "";

    public static String rtrim(String str) {
        return str.replaceAll("\\s+$", EMPTY_STRING);
    }

    public static void main(String[] args) {
        String str = "  Hello World  ";

        System.out.println("Right Trim :" + rtrim(str) + ":");
    }

}
