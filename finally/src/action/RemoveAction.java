package action;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import vo.Book;

public class RemoveAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		String StrBookno = request.getParameter("bookno");
		int bookno = Integer.parseInt(StrBookno);
		HttpSession session = request.getSession();
		HashMap books = (HashMap) session.getAttribute("books");
		Book book = (Book) books.get(bookno);
		float money = (Float) session.getAttribute("money");
		money = money - book.getBooknumber() * book.getBookprice();
		session.setAttribute("money",money);
		books.remove(bookno);
		return SUCCESS;
	}
	
}
