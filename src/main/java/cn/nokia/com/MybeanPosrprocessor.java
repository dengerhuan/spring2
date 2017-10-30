package cn.nokia.com;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by fan on 2017/10/22.
 */
public class MybeanPosrprocessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {

        if (s.equals("service")) {
            Service service = (Service) o;
            service.setDao(new Dao());
        }

        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
