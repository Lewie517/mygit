package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import vo.Book;

public class GoodsDao {

	public static void addGoods(int cartid) throws Exception {
		// 传购物车的books过来
		HttpSession session = ServletActionContext.getRequest().getSession();
		HashMap<Integer, Book> books = (HashMap) session.getAttribute("books");
		// 分别存入数据库
		Connection con = DBUtil.getConnection();
		String sql = " INSERT INTO goods " + " ( bookno , cartid , bookname , booknumber , bookprice ) "
				+ "VALUES(?,?,?,?,?)";
		PreparedStatement psm = con.prepareStatement(sql);
		// psm.setInt(1, );
		Set set = books.keySet();
		Iterator ite = set.iterator();
		while (ite.hasNext()) {
			Integer bookno = (Integer) ite.next();
			Book book = (Book) books.get(bookno);
			//打入
			psm.setInt(1, book.getBookno());
			psm.setInt(2, cartid);
			psm.setString(3, book.getBookname());
			psm.setInt(4, book.getBooknumber());
			psm.setFloat(5, book.getBookprice());
			psm.execute();
			System.out.println("books传入数据库成功！");
		}
	}
	
	public static void deleteGoods(int cartid) throws Exception{
		
		Connection con = DBUtil.getConnection();
		String sql = " DELETE FROM goods " + " WHERE cartid=? ";
		PreparedStatement psm = con.prepareStatement(sql);
		psm.setInt(1, cartid);
		psm.execute();
		
	}
	
	public static HashMap<Integer, Book> queryGoods(int cartid) throws Exception{
		HashMap<Integer, Book> books = new HashMap<Integer, Book>();
		Connection con = DBUtil.getConnection();
		String sql = " SELECT * FROM goods WHERE cartid=? ";
		PreparedStatement psm = con.prepareStatement(sql);
		ResultSet rs = psm.executeQuery(sql);
		while (rs.next()) {
			Book book = new Book();
			book.setBookno(rs.getInt("bookno"));
			book.setBookname(rs.getString("bookname"));
			book.setBookprice(rs.getFloat("bookprice"));
			books.put(book.getBookno(), book);
			
		}
		
		return books;//记得放入session中
	}

}
