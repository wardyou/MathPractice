package Sort;

public class SortTest {
    public static void main(String[] args) {
        int[] arry = {5,8,1,9,4,5,6,3,10};
        int[] arrys =  InsertSort.insertionSort(arry);
        for (int i : arrys) {
            System.out.println(i);
        }
    }

}
