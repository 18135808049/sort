import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class BubbleSorting {
    /*
        冒泡排序
     */
    public static void main(String[] args) {
        int[] arr = {55, 22, 44, 77, 66, 33, 88};
                  // 55, 44, 77, 66, 33, 88, 22
                  // 55, 77, 66, 44, 88, 33, 22
        bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
