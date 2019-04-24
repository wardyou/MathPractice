package spring;

/**
 * 模板模式
 */
public abstract class BaseCommand {
    //执行器
    public void excute(){
        System.out.println("开始执行日志，事物等操作");
        doBusiness();
        System.out.println("结束执行日志，事物等操作");
    }
    //执行需要自己实现的内容
    public abstract void doBusiness();

}
