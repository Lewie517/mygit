package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.CartDao;
import dao.DBUtil;
import dao.GoodsDao;
import vo.Book;
import vo.User;

public class LoginAction extends ActionSupport implements ModelDriven<User>{
	private static final long serialVersionUID = 1L;
	private User user = new User();
	
	@Override
	public String execute() throws Exception {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}//
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore?useUnicode=true&characterEncoding=utf-8&useSSL=false","root","wwwNBA004");
		String sql = " select username,password from user " + " where username= ? and password= ? ";
		PreparedStatement psm = (PreparedStatement) con.prepareStatement(sql);
		psm.setString(1, user.getUsername());
		psm.setString(2, user.getPassword());
		ResultSet rs = psm.executeQuery();
		HttpServletRequest request = ServletActionContext.getRequest();
		//Map session = ActionContext.getContext().getSession();
		String servercode = (String) request.getSession().getAttribute("servercode");
		String checkcode = request.getParameter("checkcode").toUpperCase();
		while(rs.next()){
			if(rs != null){
				if(rs.getString("username").equals(user.getUsername())&&rs.getString("password").equals(user.getPassword())){
					if(servercode.equals(checkcode))
					{
						HttpSession session = request.getSession();
						session.setAttribute("user", user);
						//取出books放入session中//取出userid对应的cartid
						int cartid = CartDao.queryCartId(queryID());
						HashMap<Integer, Book> books = GoodsDao.queryGoods(cartid);
						session.setAttribute("books", books);
						GoodsDao.deleteGoods(cartid);
						return SUCCESS;
					}
					else
					{
						return "error1";
					}
				}
			}
		}
		return ERROR;
	}

	@Override
	public User getModel() {
		return user;
	}
	
	public int queryID() throws SQLException{
		
		Connection con = DBUtil.getConnection();
		String sql = " SELECT * FROM user WHERE username=? ";
		PreparedStatement psm = con.prepareStatement(sql);
		psm.setString(1, user.getUsername());
		ResultSet rs = psm.executeQuery();
		int userid ;
		while(rs.next()){
			userid = rs.getInt("id");
			user.setId(userid);
		}
		return user.getId();
	}
	
}
