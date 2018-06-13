package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CartDao {

	public static void addCart(int userid) throws Exception {

		Connection con = DBUtil.getConnection();
		String sql = " INSERT INTO cart " + " ( userid ) " + " VALUES(?) ";
		PreparedStatement psm = con.prepareStatement(sql);
		psm.setInt(1, userid);
		psm.execute();
		System.out.println("购物车ID添加成功");

	}

	public static int queryCartId(int userid) throws Exception {// 获取cartid元素

		Connection con = DBUtil.getConnection();
		
		String sql = " SELECT id FROM cart WHERE userid= "+userid;
		PreparedStatement psm = con.prepareStatement(sql);
		ResultSet rs = psm.executeQuery();
		int cartid = rs.getInt(1);
		return cartid;
	}

	public static int queryUserId() throws Exception {// 获取userid元素

		Connection con = DBUtil.getConnection();
		String sql = " SELECT cartid FROM cart WHERE userid=?";
		PreparedStatement psm = con.prepareStatement(sql);
		ResultSet rs = psm.executeQuery();
		int userid = rs.getInt(1);
		return userid;
	}

}
