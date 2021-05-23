package com.examly.springapp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bookid;
	private String bookName;
	private String genre;
	private int quantity;
	public BookModel() {
		
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public BookModel(String bookName, String genre, int quantity) {
		super();
		this.bookName = bookName;
		this.genre = genre;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "BookModel [bookid=" + bookid + ", bookName=" + bookName + ", genre=" + genre + ", quantity=" + quantity
				+ "]";
	}
	
	
}
