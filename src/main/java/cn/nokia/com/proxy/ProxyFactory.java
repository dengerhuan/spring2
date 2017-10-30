package cn.nokia.com.proxy;

/**
 * Created by fan on 2017/10/22.
 */
public class ProxyFactory implements Car {

    private Car car;

    public ProxyFactory(Car car) {
        this.car = car;
    }

    public void run() {

        System.out.println("do somethinf  before  car run");
        car.run();
        System.out.println("do something  after car run");
    }
}
