package action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.DBUtil;
import dao.UserDao;

import vo.User;

public class RegisterAction extends ActionSupport implements ModelDriven<User>{
	private static final long serialVersionUID = 1L;
	private User user = new User();
	@Override
	public User getModel() {
		return user;
	}
	@Override
	public String execute() throws Exception {
		
		Connection con = DBUtil.getConnection();
		String sql = " SELECT * FROM user WHERE username=? ";
		PreparedStatement psm = con.prepareStatement(sql);
		psm.setString(1, user.getUsername());
		ResultSet rs = psm.executeQuery();
		while(rs.next()){
			if(rs != null){
				return "error";
			}
		}
		UserDao.addUser(user);
		return SUCCESS;
		
		
	}
	
	
	
}
