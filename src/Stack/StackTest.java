package Stack;

import java.math.BigInteger;
import java.util.Stack;

/**
 * 测试
 */
public class StackTest {
    public static void main(String[] arg) {
        ArryStack arryStack = new ArryStack(2);
        arryStack.push("1个");
        arryStack.push("2个");
        arryStack.push("3个");
        System.out.println(arryStack.pop());
        System.out.println(arryStack.pop());
        System.out.println(arryStack.pop());
        String t = "{{{()}}}";
        BigInteger a = new BigInteger("82");
        BigInteger b = new BigInteger("51");
        System.out.println(getmath(a, b, 31));


    }

    //匹配括号
    public static boolean Suit(String str) {
        boolean result = false;
        if (str.trim().isEmpty()) {
            return false;
        }
        int size = str.trim().length() / 2;
        char[] tmp = str.toCharArray();
        ArryStack arryStack = new ArryStack(size);
        for (int i = 0; i < str.length(); i++) {
            String temp = String.valueOf(tmp[i]);
            if (i < size) {
                arryStack.push(temp);
            } else {
                result = getBract(arryStack.pop(), temp);
                if (!result) {
                    return false;
                }
            }
        }
        return result;
    }

    public static boolean getBract(String a, String b) {
        if ("(".equals(a) && ")".equals(b)) {
            return true;
        } else if ("[".equals(a) && "]".equals(b)) {
            return true;
        } else if ("{".equals(a) && "}".equals(b)) {
            return true;
        }
        return false;
    }

    public static BigInteger getmath(BigInteger a, BigInteger b, int c) {
        Stack<Integer> stack = new Stack<>();
        BigInteger[] arr = new BigInteger[c];
        arr[0] = a;
        arr[1] = b;
        arr[2] = a.add(b);
        BigInteger temp = null;
        for (int i = 3; i < c; i++) {
            arr[i] = arr[i - 2].add(arr[i - 1]);
            temp = arr[i];
        }
        return temp;
    }
}
