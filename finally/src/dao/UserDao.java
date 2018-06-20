package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import vo.User;

public class UserDao {
	//1.添加用户，
	public static void addUser(User u) throws Exception{
		
		Connection con = DBUtil.getConnection();
		//执行sql语句
		String sql = " INSERT INTO user " + " ( username , password , address , phone ) " 
		+ "VALUES(?,?,?,?)";
		PreparedStatement psm = con.prepareStatement(sql);
		psm.setString(1, u.getUsername());
		psm.setString(2, u.getPassword());
		psm.setString(3, u.getAddress());
		psm.setString(4, u.getPhone());
		psm.execute();
		psm.close();
		System.out.println("添加成功");
		
	}
	//删除用户
	public static void deleteUser(Integer id) throws Exception{
		
		Connection con = DBUtil.getConnection();
		String sql = " DELETE FROM user " + " WHERE id=? ";
		PreparedStatement psm = con.prepareStatement(sql);
		psm.setInt(1, id);
		psm.execute();
		
		System.out.println("删除成功");
		
	}
	//修改用户
	public static void updateUser(User u) throws Exception{
		
		Connection con = DBUtil.getConnection();
		String sql = " UPDATE user " + " SET username=? , password=? , address=? , phone=?" + " WHERE id=?";
		PreparedStatement psm = con.prepareStatement(sql);
		psm.setString(1, u.getUsername());
		psm.setString(2, u.getPassword());
		psm.setString(3, u.getAddress());
		psm.setString(4, u.getPhone());
		psm.setInt(5, u.getId());
		psm.execute();
		System.out.println("修改成功");
		
	}
	
	public static ArrayList<User> queryAllUser() throws Exception {// 获取cartid元素
		Connection con = DBUtil.getConnection();
		String sql = " SELECT * FROM user  ";
		PreparedStatement psm = con.prepareStatement(sql);
		ResultSet rs = psm.executeQuery();
		ArrayList<User> users = new ArrayList<User>();
		while(rs.next()){
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setAddress(rs.getString("address"));
			user.setPhone(rs.getString("phone"));
			users.add(user);
		}
		return users;
	}
}
