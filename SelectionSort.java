import java.util.Arrays;

public class SelectionSort {
    public static void main(MyString[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4 };
        Selection(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void Selection(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int last = arr.length - i - 1;

            int maxIndex = getMaxIndex(arr, 0, last);

            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;

        for (int i = start; i <= last; i++) {

            if (arr[max] < arr[i]) {
                max = i;
            }

        }
        return max;
    }
}

// Select an Element and Place the that element at the Currect indexor Position
// in every iteration every max element swap with last position and last
// position - 1 in every iteration
// Time Compplexity

// Worst Case O(n2)
// Best case O(n2)
// not Stable