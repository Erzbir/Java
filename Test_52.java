public class Test_52 {
    public static void main(String[] args) {
        int[] arr = {10, 8, 5, 27, 99};
        System.out.println(count(arr));
    }

    private static int count(int[] arr) {
        int result = 0;
        for (int j : arr) {
            int n = j;
            while (n > 0) {
                n -= 2;
                result++;
            }
        }
        return result;
    }
}