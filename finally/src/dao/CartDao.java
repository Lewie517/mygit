package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class CartDao {
	
	public static void addCart(int userid) throws Exception{
		
		Connection con = DBUtil.getConnection();
		String sql = " INSERT INTO cart " + " ( userid ) " + "VALUES(?)";
		PreparedStatement psm = con.prepareStatement(sql);
		psm.setInt(1, userid);
		psm.execute();
		System.out.println("购物车ID添加成功");
		
	}
	
}
