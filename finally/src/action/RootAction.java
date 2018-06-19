package action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class RootAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username != null && password != null){
			
			if(username.equals("root") && password.equals("admin")){
				return SUCCESS;
			}
			return ERROR;
		}
		
		return ERROR;
	}
	
	
	
}
