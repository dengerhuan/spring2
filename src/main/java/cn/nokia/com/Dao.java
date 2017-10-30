package cn.nokia.com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

/**
 * Created by fan on 2017/10/21.
 */

@Repository
public class Dao {

    private Logger logger = LogManager.getLogger(Dao.class);

    private String dataSource = "dbcp";

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public void save() {

        logger.info("save by " + dataSource);
    }

    public Dao() {
        logger.debug("Dao's Constructot...");
    }

}
