package action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDao;

public class RemoveUserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		String StrUserid = request.getParameter("userid");
		int userid = Integer.parseInt(StrUserid);
		UserDao.deleteUser(userid);
		return SUCCESS;
	}
	
	
	
}
