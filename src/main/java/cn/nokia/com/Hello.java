package cn.nokia.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fan on 2017/10/22.
 */
public class Hello {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("annotation.xml");
        Dao d = (Dao) ctx.getBean("dao");
        d.save();


        Service s= (Service) ctx.getBean("service");
        s.save();
    }
}
