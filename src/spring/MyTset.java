package spring;

import Sort.SimpleList;
import spring.decorate.Command;
import spring.decorate.LoggerDecorate;
import spring.decorate.PerformanceDecorate;

public class MyTset {
    public static void main(String[] args) {
        Command orderCommand = new LoggerDecorate(new PerformanceDecorate(new OrderCommand()));

        orderCommand.execute();
        SimpleList<Integer> simpleList = new SimpleList();
        simpleList.add(1);
        simpleList.add(1);
        simpleList.add(1);
        int a =1;
        assert a !=0: "a is not 0";
        System.out.println( simpleList.Size()+"="+simpleList.get(3));
        new Thread(
                ()->{
            System.out.println("123");
        });
    }
}
