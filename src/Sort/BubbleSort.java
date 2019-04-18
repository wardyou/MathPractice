package Sort;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        if (null == arr) {
            return null;
        }
        for (int i = 0; i < arr.length; i++) {
            //是否交换
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                int temp = arr[j];
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                return arr;
            }
        }
        return arr;
    }
}
