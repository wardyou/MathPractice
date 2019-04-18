package Queue;

/**
 * 数组实现队列,顺序队列
 */
public class ArryQueue<E> {
    private int size;
    private E[] object;
    private int head;
    private int end;

    public ArryQueue(int size) {
        this.size = size;
    }

}
