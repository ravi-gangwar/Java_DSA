import java.lang.reflect.Array;
import java.util.Arrays;

public class CyclicSort {
    public static void main(MyString[] args) {
        int[] arr = { 7, 6, 5, 4, 3, 3, 1, 9 };
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int CurrectIndex = arr[i] - 1;
            if (arr[CurrectIndex] != arr[i]) {
                swap(arr, i, CurrectIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int ci) {
        int temp = arr[i];
        arr[i] = arr[ci];
        arr[ci] = temp;
    }
}
