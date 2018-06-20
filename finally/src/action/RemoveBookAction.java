package action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.BookDao;
import dao.UserDao;

public class RemoveBookAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		String StrBookid = request.getParameter("bookno");
		int bookno = Integer.parseInt(StrBookid);
		BookDao.deleteBook(bookno);
		return SUCCESS;
	}
	
	
	
}
