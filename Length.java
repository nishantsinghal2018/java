public class Length {
    public int countDig(int n) {
        int count = 0;
        while (n != 0) {

            n = n / 10;

            count = count + 1;
        }
        return count;
    }

    public static void main(String argvs[]) {

        int arr[] = { 78, 9, 2345, 899009, 1, 414, 34, 1000, 2749 };

        int size = arr.length;

        Length obj = new Length();
        for (int i = 0; i < size; i++) {
            int count = obj.countDig(arr[i]);
            System.out.println("The length of the number " + arr[i] + " is " + count);
        }
    }

}
