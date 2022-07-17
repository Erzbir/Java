import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class Temp {
    public static void main(String[] args) {
        int[] arr = {1, 100, -10, 50, 3, -5, 96};
        insertSort(arr);
        for (int item : arr) {
            System.out.println(item);
        }
        System.out.println(halfSearch(50, arr));

    }
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    // j对应的下标才是最下值
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
    public static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
    public static int halfSearch(int target, int... arr) {
        insertSort(arr);
        int head = 0, rear = arr.length - 1, mid;
        while (head <= rear) {
            mid = head + ((rear - head) >> 1);
            if (arr[mid] > target) {
                rear = mid - 1;
            }
            else if (arr[mid] < target){
                head = mid + 1;
            }
            else {
                return mid;
            }
        }
        return arr.length > 0 ? 0 : -1;
    }
}

