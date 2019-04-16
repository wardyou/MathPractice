package Stack;

import sun.applet.Main;

/**
 * 数组实现栈,顺序栈
 */
public class ArryStack {
    //栈的大小
    private int size;
    //数组
    private String[] items;
    //栈的元素个数
    private int count;

    //初始化数组
    public ArryStack(int size) {
        this.size = size;
        this.items = new String[size];
        this.count = 0;
    }

    //入栈
    public boolean push(String item) {
        //满栈
        if (count == size) {
            return false;
        }
        this.items[count] = item;
        ++count;
        return true;
    }

    //出栈
    public String pop() {
        //栈为空
        if (0 == count || 0 == size) {
            return null;
        }
        String tmp = this.items[count - 1];
        --count;
        return tmp;

    }
    //得到栈顶
    public String top(){
        return this.items[count];

    }
}
