package cn.nokia.com.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by fan on 2017/10/22.
 */
public class DynamicProxy {

    private Logger logger = LogManager.getLogger(DynamicProxy.class);

    private Object target;

    DynamicProxy(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {

        ClassLoader load = target.getClass().getClassLoader();
        Class[] interfaces = target.getClass().getInterfaces();
        return Proxy.newProxyInstance(load, interfaces,
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        logger.info("do something before invok");
                        return method.invoke(target, args);
                    }
                });
    }
}
