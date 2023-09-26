import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = { 9, 8, 7, 6, 5, 4 };
        bubbleSort(arr);
        System.out.print(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int c = 0;

            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j] < arr[j - 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    c++;
                }
            }
            if (c == 0) {
                break;
            }

        }
    }
}

// it is Stable Sorting Algorithm
