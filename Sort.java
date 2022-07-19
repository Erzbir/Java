public class Sort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 6, 4, 1, 0, 2, 9, 10, 8};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    private static void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[b] ^ arr[a];
        arr[a] = arr[a] ^ arr[b];
    }

    public static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    // j对应的下标才是最下值
                    min = j;
                }
            }
            if (min != i) {
                swap(arr, i, min);
            }
        }
    }

    public static void selectSort_2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static void quickSort(int[] arr, int left, int right) {
        int i = left, j = right;
        int key = arr[left];
        while (i < j) {
            while (i < j && key <= arr[j]) {
                j--;
            }
            while (i < j && key >= arr[i]) {
                i++;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        arr[left] = arr[i];
        arr[i] = key;
        if (i > left) {
            quickSort(arr, left, i - 1);
        }
        if (j < right) {
            quickSort(arr, i + 1, right);
        }

    }
}
