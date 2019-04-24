package spring;

import spring.decorate.Command;
import spring.decorate.LoggerDecorate;
import spring.decorate.PerformanceDecorate;

public class MyTset {
    public static void main(String[] args) {
        Command orderCommand = new LoggerDecorate(new PerformanceDecorate(new OrderCommand()));
        orderCommand.execute();
    }
}
