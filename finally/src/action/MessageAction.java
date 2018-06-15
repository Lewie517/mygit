package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.MessageDao;
import vo.User;

public class MessageAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		String username = user.getUsername();
		String message = request.getParameter("message");
		MessageDao.addMessage(username, message);
		System.out.println("ÃÌº”¡Ù—‘≥…π¶£°");
		return SUCCESS;
	}
	
	
	
}
