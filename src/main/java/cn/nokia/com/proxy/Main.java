package cn.nokia.com.proxy;

/**
 * Created by fan on 2017/10/22.
 */
public class Main {

    public static void main(String[] args) {
        Car car = new Benci();
       /* ProxyFactory carproxy = new ProxyFactory(car);
        carproxy.run();*/


        Car car2 = (Car) new DynamicProxy(car).getProxyInstance();

        car2.run();
    }
}
