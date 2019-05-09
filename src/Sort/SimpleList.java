package Sort;

public class SimpleList<T> {
    public Object[] elementData;
    private int size = 0;
    private T[] elem = null;

    //得到集合大小
    public int Size() {
        return size;
    }

    public SimpleList() {
        //初始化数组大小
        this.elementData = new Object[8];
    }

    //是否为空
    public boolean isEmpty() {
        if (0 == Size()) {
            return true;
        }
        return false;
    }

    //add
    public boolean add(T o) {
        //扩容
        isFull();
        int length = elementData.length;
        for (int i = 0; i < length; i++) {
            Object temp = elementData[i];
            if (null == temp) {
                elementData[i] = o;
                size++;
                return true;
            }
        }
        return false;
    }

    //remove
    public boolean remove(T o) {
        int length = elementData.length;
        Object[] tem = new Object[size--];
        for (int i = 0; i < length; i++) {
            Object temp = elementData[i];
            if (temp == o) {
                elementData[i] = null;
                size--;
            }
            tem[i]=elementData[i];
        }
        elementData=tem;
        return false;
    }

    //得到一个元素
    public T get(int index) {
        return (T) elementData[index];
    }

    private void isFull() {
        int length = elementData.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            Object temp = elementData[i];
            if (null == temp) {
                count++;
            }
        }
        if (count == 0) {
            size = size * 2;
        }

    }
}
