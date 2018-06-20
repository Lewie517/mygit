package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import vo.Book;

public class BookDao {
	private static Connection con = null;

	public static HashMap<Integer, Book> getAllBook() throws Exception {// 从数据库获取书名
		HashMap<Integer, Book> books = new HashMap<Integer, Book>();
		// initConnection();
		con = DBUtil.getConnection();
		String sql = " SELECT BOOKNO,BOOKNAME,BOOKPRICE FROM book ";
		Statement psm = con.createStatement();
		ResultSet rs = psm.executeQuery(sql);
		while (rs.next()) {
			Book book = new Book();
			book.setBookno(rs.getInt("bookno"));
			book.setBookname(rs.getString("bookname"));
			book.setBookprice(rs.getFloat("bookprice"));
			books.put(book.getBookno(), book);
			// System.out.println(book.toString());
		}
		// con.close();
		return books;
	}
	
	public static void addBook(Book b) throws Exception{
		
		con = DBUtil.getConnection();
		String sql = " INSERT INTO book " + " ( BOOKNAME , BOOKPRICE ) "
				+ "VALUES(?,?)";
		PreparedStatement psm = con.prepareStatement(sql);
		psm.setString(1, b.getBookname());
		psm.setFloat(2, b.getBookprice());
		psm.execute();
	}
	
	public static void deleteBook(int bookno) throws Exception{
		
		con = DBUtil.getConnection();
		String sql = " DELETE FROM book " + " WHERE BOOKNO=? ";
		PreparedStatement psm = con.prepareStatement(sql);
		psm.setInt(1, bookno);
		psm.execute();
		
	}
	
	public static ArrayList<Book> queryBook() throws Exception{
		
		ArrayList<Book> books = new ArrayList<Book>();
		con = DBUtil.getConnection();
		String sql = " SELECT BOOKNO,BOOKNAME,BOOKPRICE FROM book ";
		Statement psm = con.createStatement();
		ResultSet rs = psm.executeQuery(sql);
		while (rs.next()) {
			Book book = new Book();
			book.setBookno(rs.getInt("bookno"));
			book.setBookname(rs.getString("bookname"));
			book.setBookprice(rs.getFloat("bookprice"));
			books.add(book);
		}
		return books;
	}
	
}
