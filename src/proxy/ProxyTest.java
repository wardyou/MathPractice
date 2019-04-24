package proxy;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        HelloWord helloWord = new HelloWord();
        LoggerHandle loggerHandle = new LoggerHandle(helloWord);
        IHelloWorld proyx = (IHelloWorld) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), helloWord.getClass().getInterfaces(), loggerHandle);
        proyx.sayHello();
    }
}
