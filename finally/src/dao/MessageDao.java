package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

import vo.Message;

public class MessageDao {
	
	public static void addMessage(String username,String message) throws Exception{
		
		Connection con = DBUtil.getConnection();
		String sql = " INSERT INTO message " + " (username,message) " + " VALUES(?,?) ";
		PreparedStatement psm = con.prepareStatement(sql);
		psm.setString(1, username);
		psm.setString(2, message);
		psm.execute();
		
	}
	
	public static HashMap<Integer, Message> queryMessage() throws Exception{
		
		HashMap<Integer, Message> allMessage = new HashMap<Integer, Message>();
		Connection con = DBUtil.getConnection();
		String sql = " SELECT * FROM message ";
		PreparedStatement psm = con.prepareStatement(sql);
		ResultSet rs = psm.executeQuery();
		while(rs.next()){
			Message m = new Message();
			m.setId(rs.getInt("id"));
			m.setUsername(rs.getString("username"));
			m.setMessage(rs.getString("message"));
			allMessage.put(m.getId(), m);
		}
		
		return allMessage;
	}
	
}
