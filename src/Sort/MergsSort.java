package Sort;

/**
 * 归并排序
 * 1.递归公式：merge(p...r)=merge(merge(p...q),merge(q+1...r));
 * 2.终止条件：p>=r 不需要分解
 */
public class MergsSort {
    public static void sort(int[] data, int left, int right) {
        if (left < right) {
            // 首先找出中间的索引
            int center = (left + right) / 2;

            // 对中间索引左边的数组进行递归
            sort(data, left, center);

            // 对中间索引右边的数组进行递归
            sort(data, center + 1, right);
            // 合并
            merge(data, left, center, right);
        }
    }

    public static void merge(int[] data, int left, int center, int right) {
        int[] tmpArr = new int[data.length];
        int mid = center + 1;
        // third记录中间数组的索引
        int third = left;
        int tmp = left;
        while (left <= center && mid <= right) {
            // 将两个数组中取出最小的数放入中间数组
            if (data[left] <= data[mid]) {
                tmpArr[third++] = data[left++];
            } else {
                tmpArr[third++] = data[mid++];
            }
        }

        // 剩余部分依次放入中间数组
        while (mid <= right) {
            tmpArr[third++] = data[mid++];
        }
        while (left <= center) {
            tmpArr[third++] = data[left++];
        }
        while(tmp <= right){
            data[tmp] = tmpArr[tmp++];
        }
    }

    public static void main(String[] args) {
        int[] a = { 3, 2, 5, 4,10,50,1,5,80,32,21,20,52,30};
        System.out.println(System.nanoTime());
        sort(a, 0, a.length - 1);
        System.out.println(System.nanoTime());
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
