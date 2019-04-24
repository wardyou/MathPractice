package spring.decorate;
/**
 * 日志装饰器
 */
public class LoggerDecorate implements Command{
    Command cmd;
    public LoggerDecorate(Command command) {
        this.cmd = command;
    }
    public void execute() {
        System.out.println("开始日志");
        cmd.execute();
        System.out.println("结束日志");
    }
}
