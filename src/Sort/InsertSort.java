package Sort;

/**
 * 插入排序
 */
public class InsertSort {

    public static int[] InsertionSort(int [] arr){
        if (null == arr || 1 >= arr.length) {
            return null;
        }
        for (int i = 0;i<arr.length; ++i) {
            int value = arr[i];
            int j = i-1;
            for (;j>=0;--j){
                if(arr[j] > value){
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+1] = value;
        }
    return arr;
}
}
