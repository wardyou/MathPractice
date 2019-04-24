package spring;

import spring.decorate.Command;

public class OrderCommand implements Command {
    public void doBusiness() {
        System.out.println("开始处理订单");
    }

    @Override
    public void execute() {
        System.out.println("开始处理订单");
    }
}
