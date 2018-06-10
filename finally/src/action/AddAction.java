package action;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import vo.Book;

public class AddAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		HashMap<Integer, Book> books = (HashMap) session.getAttribute("books");
		String StrBookno = request.getParameter("bookno");
		String bookname = request.getParameter("bookname");
		String StrBookprice = request.getParameter("bookprice");
		String StrBooknumber = request.getParameter("booknumber");
		int bookno = Integer.parseInt(StrBookno);
		int booknumber = Integer.parseInt(StrBooknumber);
		float bookprice = Float.parseFloat(StrBookprice);
		Book book = new Book();
		book.setBookno(bookno);
		book.setBookname(bookname);
		book.setBookprice(bookprice);
		book.setBooknumber(booknumber);
		books.put(bookno,book);
		float money = (Float) session.getAttribute("money");
		money = money + bookprice * booknumber;
		session.setAttribute("money",money);
		
		return SUCCESS;
	}
	
	
	
}
