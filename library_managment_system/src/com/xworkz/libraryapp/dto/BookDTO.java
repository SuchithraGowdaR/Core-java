package com.xworkz.libraryapp.dto;

public class BookDTO {
	private int bookId;
	private String title;
	private String author;
	private float price;
	private String adition;
	public BookDTO() {
		System.out.println("invoking BookDTO constructor");
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getAdition() {
		return adition;
	}
	public void setAdition(String adition) {
		this.adition = adition;
	}
	@Override
	public String toString() {
		return "BookDTO [bookId=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price
				+ ", adition=" + adition + "]";
	}
	
	
	

}
