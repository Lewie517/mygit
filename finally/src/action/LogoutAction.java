package action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.CartDao;
import dao.GoodsDao;
import vo.User;

public class LogoutAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.write("注销成功");
        //response.setHeader("Refresh", "2;URL="+request.getContextPath());
        //books放入数据库中
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        int cartid = CartDao.queryCartId(user.getId());
        if(session.getAttribute("books") != null){
        	GoodsDao.addGoods(cartid);//放入数据库
        }  
        		
		session.setAttribute("books", null);
		session.setAttribute("user", null);
		session.setAttribute("money", 0F);
		return SUCCESS;
	}
	
	
	
}
