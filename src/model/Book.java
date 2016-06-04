package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Book implements Serializable {

	public String bookname;
	public String author;
	public Float price;

	public Book(String bookname, String author, float price) {
		this.bookname = bookname;
		this.author = author;
		this.price = price;
	}

	public void printBookInfo() {
		System.out.println("Bookname:" + bookname + "\n");
		System.out.println("Author" + author + "\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
