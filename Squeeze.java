public class Squeeze {
    public static String squeeze(String s) {
        char[] a = s.toCharArray();
        int n = 1;
        for (int i = 1; i < a.length; i++) {
            a[n] = a[i];
            if (a[n] != ' ')
                n++;
            else if (a[n - 1] != ' ')
                n++;
        }
        return new String(a, 0, n);
    }

    public static void main(String[] args) {
        StdOut.println(squeeze(args[0]));
    }
}
