package spring.decorate;

/**
 * 性能装饰器
 */
public class PerformanceDecorate implements Command {
    Command cmd;

    public PerformanceDecorate(Command cmd) {
        this.cmd = cmd;
    }

    @Override
    public void execute() {
        System.out.println("开始性能");
        cmd.execute();
        System.out.println("结束性能");
    }
}
