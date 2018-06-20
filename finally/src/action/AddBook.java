package action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.BookDao;
import vo.Book;

public class AddBook extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String bookname = request.getParameter("bookname");
		String StrBookprice = request.getParameter("bookprice");
		float bookprice = Float.parseFloat(StrBookprice);
		Book book = new Book();
		book.setBookname(bookname);
		book.setBookprice(bookprice);
		BookDao.addBook(book);
		System.out.println("新增成功");
		return SUCCESS;
	}
	
	
	
}
