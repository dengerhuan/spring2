package cn.nokia.com;

import org.springframework.stereotype.Repository;

/**
 * Created by fan on 2017/10/21.
 */

@Repository
public class Dao {

    private String dataSource = "dbcp";

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public void save() {
        System.out.println("save by " + dataSource);
    }

    public Dao() {
        System.out.println("Dao's Constructor...");
    }

}
