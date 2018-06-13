package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import vo.User;

public class CartDao {

	public static void addCart(int userid) throws Exception {

		Connection con = DBUtil.getConnection();
		String sql = " INSERT INTO cart " + " ( userid ) " + " VALUES(?) ";
		PreparedStatement psm = con.prepareStatement(sql);
		psm.setInt(1, userid);
		psm.execute();
		System.out.println("���ﳵID��ӳɹ�");

	}

	public static int queryCartId(int userid) throws Exception {// ��ȡcartidԪ��
		Connection con = DBUtil.getConnection();
		String sql = " SELECT * FROM cart WHERE userid=? ";
		PreparedStatement psm = con.prepareStatement(sql);
		psm.setInt(1, userid);
		ResultSet rs = psm.executeQuery();
		int cartid;
		User user = new User();
		while(rs.next()){
			cartid = rs.getInt("id");
			user.setId(cartid);
		}
		return user.getId();
	}

//	public static int queryUserId() throws Exception {// ��ȡuseridԪ��
//
//		Connection con = DBUtil.getConnection();
//		String sql = " SELECT cartid FROM cart WHERE userid=?";
//		PreparedStatement psm = con.prepareStatement(sql);
//		ResultSet rs = psm.executeQuery();
//		int userid = rs.getInt(1);
//		return userid;
//	}

}
