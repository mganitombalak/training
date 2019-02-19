package com.ibtech;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.util.logging.Level;

@ManagedBean(name = "home")
@RequestScoped
public class HomeController {

	@ManagedProperty(value = "#{injectedMessage}")
	private Message messageBean;
	
	private String msg;
	
	public String getMessage() {
		if (messageBean != null) {
			msg = messageBean.getMessage();
		}
		return msg;
	}
	
	public void setMessageBean(Message pmessageBean) {
		this.messageBean = pmessageBean;
	}

}
