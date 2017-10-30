package cn.nokia.com;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Action {
    private Logger logger = LogManager.getLogger(Action.class);

    @Autowired
    private Service service;

    public void setService(Service service) {
        this.service = service;
    }

    public Service getService() {
        return service;
    }

    public void execute() {
        logger.debug("Action's execute...");
        service.save();
    }

}
