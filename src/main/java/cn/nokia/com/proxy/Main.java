package cn.nokia.com.proxy;

import org.junit.Test;

/**
 * Created by fan on 2017/10/22.
 */
public class Main {

    public static void main(String[] args) {

        new Main().run();
    }


    @Test
    public void run() {
        Car car = new Benci();
        ProxyFactory carproxy = new ProxyFactory(car);
        carproxy.run();
        Car car2 = (Car) new DynamicProxy(car).getProxyInstance();
        car2.run();

    }
}
