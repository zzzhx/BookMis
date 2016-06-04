package operate;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import linkDatabase.LinkDatabase;
import model.Book;
import model.BookList;

public class Method {
	
		public Method() {
		// TODO Auto-generated constructor stub
	}

	public boolean addBook(Book book) {
		int result = 0;

		try {
			// Connection conn = new Connection();
			Connection conn = LinkDatabase.getConnection();
			if (conn == null)
				System.out.println("Error!!!!");
			// Statement stm ;
			Statement stm = conn.createStatement();
			String sql = "insert into booklist.booklist (bookname,author,price)"
					+ " values('"
					+ book.bookname
					+ "','"
					+ book.author
					+ "',"
					+ book.price + ")";

			result = stm.executeUpdate(sql);
			LinkDatabase.closeConnection(stm, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == 1)
			return true;
		else {
			return false;
		}

	}

	public boolean deleteBook(String bookname) {
		int result = 0;
		Connection conn = null;
		try {
			conn = LinkDatabase.getConnection();
			Statement stm = null;
			stm = conn.createStatement();
			String sql = "delete from booklist.booklist where bookname= '"
					+ bookname + "'";
			result = stm.executeUpdate(sql);
			LinkDatabase.closeConnection(stm, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (result == 1)
			return true;
		else {
			return false;
		}
	}

	public void printData() {
		Connection conn = null;
		try {
			conn = LinkDatabase.getConnection();
			Statement stm = null;
			stm = conn.createStatement();
			String sql = "select * from booklist.booklist";
			ResultSet rs = null;
			rs = stm.executeQuery(sql);
			LinkDatabase.closeConnection(rs, stm, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public BookList searchBook(String selection,String value)
	{
	Connection conn = null;
	Statement stm = null;
	ResultSet rs = null;
	BookList bookList = new BookList();
	try{
	conn = LinkDatabase.getConnection();

	stm = conn.createStatement();
	String sql="select bookname, author, price from booklist.booklist where "+selection+" = '"+value+"'";
	rs = stm.executeQuery(sql);
	
		while (rs.next()) {
			Book book = new Book(rs.getString("bookname"),
					rs.getString("author"), rs.getFloat("price"));
			bookList.add(book);
		}
	LinkDatabase.closeConnection(rs, stm, conn);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return bookList ;
	}

	public boolean updateBook(Book tbook, String oldname) {
		int result = 0;
		Connection conn = null;
		try {
			conn = LinkDatabase.getConnection();
			Statement stm = null;
			stm = conn.createStatement();
			String sql = "update booklist.booklist set bookname = '"
					+ tbook.bookname + "' , author = '" + tbook.author
					+ "' , price = " + tbook.price + "where bookname ='"
					+ oldname + "'";
			result = stm.executeUpdate(sql);
			LinkDatabase.closeConnection(stm, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == 1)
			return true;
		else {
			return false;
		}
	}
	
	public String getPasswd(String id)
	{
		String passwd = null;
		String sql = "SELECT password FROM booklist.users where id = '"+id+"'; ";
		try {
			Connection conn=LinkDatabase.getConnection();
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next())
			passwd = rs.getString("password");
			LinkDatabase.closeConnection(rs, stm, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		if (passwd != null) {
			return passwd;
		} else {
			return null;
		}
	}
}