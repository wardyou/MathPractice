package Sort;

public class MergsSort {
    public static int[] mergeSort(int [] arr,int n){

        return null;
    }
    public static int[] mergeSort_a(int [] arr,int p,int r){
        if (p >= r){
            return arr;
        }
        int q=(p+r)/2;
        mergeSort_a(arr,p,q);
        mergeSort_a(arr, q+1, r);
        return null;
    }

    public static int[] merge(int [] arr,int p,int r){

        return null;
    }
}
