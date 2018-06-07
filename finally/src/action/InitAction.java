package action;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.BookDao;
import vo.Book;

public class InitAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		// HttpServletResponse response = ServletActionContext.getResponse();
		HashMap<Integer, Book> allbook = BookDao.getAllBook();
		request.getSession().setAttribute("allbook", allbook);
		return SUCCESS;
	}

}
