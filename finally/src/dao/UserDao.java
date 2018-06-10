package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import vo.User;

public class UserDao {
	//1.�����û���
	public static void addUser(User u) throws Exception{
		
		Connection con = DBUtil.getConnection();
		//ִ��sql���
		String sql = " INSERT INTO user " + " ( username , password , address , phone ) " 
		+ "VALUES(?,?,?,?)";
		PreparedStatement psm = con.prepareStatement(sql);
		psm.setString(1, u.getUsername());
		psm.setString(2, u.getPassword());
		psm.setString(3, u.getAddress());
		psm.setString(4, u.getPhone());
		psm.execute();
		psm.close();
		System.out.println("���ӳɹ�");
		
	}
	//ɾ���û�
	public static void deleteUser(Integer id) throws Exception{
		
		Connection con = DBUtil.getConnection();
		String sql = " DELETE FROM user " + " WHERE id=? ";
		PreparedStatement psm = con.prepareStatement(sql);
		psm.setInt(1, id);
		psm.execute();
		
		System.out.println("ɾ���ɹ�");
		
	}
	//�޸��û�
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
		System.out.println("�޸ĳɹ�");
		
	}
}