package dao;

import java.sql.Connection;

public class GoodsDao {
	
	public static void addGoods(int cartid) throws Exception{
		
		Connection con = DBUtil.getConnection();
		String sql = " INSERT INTO goods " + " ( bookno , bookname , booknumber , bookprice ) " 
				+ "VALUES(?,?,?,?)";
		
	}
	
}
