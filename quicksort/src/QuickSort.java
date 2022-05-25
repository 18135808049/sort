import java.util.Arrays;

public class QuickSort {
    /*
        快速排序
     */
    public static void main(String[] args) {
        int[] arr = {55, 22, 44, 77, 66, 33, 88};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        //如果都比较完 都不符合就退出
        if (low<high) {
            //获取基数准确的索引位置
            int index = getIndex(arr, low, high);
            //对基数索引之前的小数组进行同样的操作找到其元素准确的索引位置
            quickSort(arr, low, index - 1);
            //对基数索引之后的小数组进行同样的操作找到其元素准确的索引位置
            quickSort(arr, index + 1, high);
        }
    }

    private static int getIndex(int[] arr, int low, int high) {
        //数组范围内第一个索引作为基数
        int tmp = arr[low];
        //当low == high 时 tmp元素的索引位置就为他们的值
        while (low != high) {
            //high从后面往前走 如果arr[high]的值大于等于tmp的值 继续往前走
            while (low < high && arr[high] >= tmp) {
                high--;
            }
            //如果arr[high]<tmp 交换两个索引的值
            arr[low] = arr[high];
            //low从前面往后走 如果arr[low]的值小于等于tmp的值 继续往后走
            while (low < high && arr[low] <= tmp) {
                low++;
            }
            //如果arr[low]>tmp 交换两个索引的值
            arr[high] = arr[low];
        }
        //将tmp的值赋值给他真正所在的索引
        arr[low] = tmp;
        //将tmp的值返回 作为接下来两个递归的参数
        return low;
    }
}
