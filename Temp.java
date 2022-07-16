public class Temp {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Main.input.nextInt();
        }
        System.out.println("平均值:" + aver(arr));
        System.out.println("最大值:" + max(arr));
    }

    public static double aver(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return (double) sum / arr.length;
    }

    public static int max(int[] arr) {
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[j]) {
                j = i;
            }
        }
        return arr[j];
    }
}
