package Sort;

/**
 * 简单的程序是递归的优点之一。但是递归调用会占用大量的系统堆栈，内存耗用多，在递归调用层次多是速度要比循环慢的多，所以在使用递归时要慎重。
 * 递归调试方法：1.打印日志，递归值。2.结合条件断点进行调试
 */
public class RecursionTest {
    public static void main(String[] args) {
        System.out.println(fb(40));
        System.out.println(fbb(40));
    }

    /**
     *
     * @param index
     * @return
     */
    public static int  fb(int index){
        if(index == 1 || index == 2){//递归头，出口
            return 1;
        }else {
            //递归体
            return fb(index-1)+fb(index-2);
        }
    }
    //非递归实现
    public static int fbb(int index){
        if(index == 1 || index == 2){
            return 1;
        }
        int res = 0;
        int pre = 1;
        int temp =1;
        for (int i = 3; i <= index; i++) {
            res = pre+temp;
            pre = temp;
            temp = res;
        }
        return res;
    }
}
