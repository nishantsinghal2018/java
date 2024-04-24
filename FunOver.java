class FunOver {
    static void show()

    {
        System.out.println("Zero argument");

    }

    static void show(int x) {
        System.out.println("One argument");
    }

    static void show(int x, int y) {
        System.out.println("two argument");

    }

    static void sho(int x, int y, int z) {
        System.out.println("three argument");
    }

    public static void main(String... s) {
        show();
    }

}