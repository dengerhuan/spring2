package cn.nokia.com;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
    private Logger logger = LogManager.getLogger(Service.class);

    private Dao dao;

    @Autowired
    public void setDao(@Autowired Dao dao) {
        this.dao = dao;
    }

    public Dao getDao() {
        return dao;
    }


    public void save() {
        logger.debug("Service's save");
        dao.save();
    }

}
