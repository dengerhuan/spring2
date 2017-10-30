package cn.nokia.com;


import org.springframework.stereotype.Controller;

@Controller
public class Action {

	private Service service;
	
	public void setService(Service service) {
		this.service = service;
	}
	
	public Service getService() {
		return service;
	}
	
	public void execute(){
		System.out.println("Action's execute...");
		service.save();
	}
	
}
