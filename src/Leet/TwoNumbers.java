package Leet;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 两数相加
 */
public class TwoNumbers {
    public class Node {
        int val;
        Node next;

        Node(int x) {
            val = x;
        }
    }

    public Node addTwoNumbers(Node l1, Node l2) {
        //是否需要进位
        boolean flag = false;
        //求和头节点
        Node sumNodeHead = new Node(0);
        //当前节点
        Node currentNode = sumNodeHead;
        //运算
        while (l1 != null || l2 != null) {
            int l1Val = l1 == null ? 0 : l1.val;
            int l2Val = l2 == null ? 0 : l2.val;
            int temp = l1Val + l2Val;
            if (flag) {
                temp = temp + 1;
            }
            if (10 <= temp) {
                flag = true;
                Node node = new Node(temp % 10);
                currentNode.next = node;
                currentNode = node;
            } else {
                flag = false;
                Node node = new Node(temp);
                currentNode.next = node;
                currentNode = node;
            }
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if (flag) {
            Node finalNode = new Node(1);
            currentNode.next = finalNode;
        }
        return sumNodeHead.next;
    }

    @Test
    public void test() {
        Node l1 = new Node(7);
        Node l2 = new Node(2);
        l1.next = new Node(9);
        l1.next.next = new Node(9);
        l2.next = new Node(2);
        addTwoNumbers(l1, l2);
        System.out.println((byte) 'a');
        List tels = new ArrayList();

        String tel = "";
        for (int i = 0; i < tels.size(); i++) {
            if (i == tels.size() - 1) {
                tel = tel + tels.get(i);
            } else {
                tel = tel + tels.get(i) + ",";
            }
        }
        System.out.println(tel);
    }

    @Test
    public void test1() {
//        Integer a = null;
//        String sql = "select * from" + a == null ? " invest" : a == 1 ? "1" : "";
//        System.out.println(sql);

        /**
         * 三目运算从右边开始
         *
         */
        Integer a1 = null;
        String sql1 = "select * from" + a1 != null ? " invest" : a1 == 1 ? "1" : "";
        System.out.println(sql1);

        Integer a2 = null;
        String sql2 = "select * from" + (a2 == null ? " invest" : a2 == 1 ? "1" : "");
        System.out.println(sql2);
    }
}
