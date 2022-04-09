package com.xworkz.libraryapp.dto;

public class BookDTO {
	private int bookId;
	private String title;
	private String author;
	private String publisher;
	private float price;
	private String edition;
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
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String adition) {
		this.edition = adition;
	}
	@Override
	public String toString() {
		return "BookDTO [bookId=" + bookId + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", price=" + price + ", adition=" + edition + "]";
	}
	
	
	
	

}
