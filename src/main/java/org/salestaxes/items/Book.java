package org.salestaxes.items;

public class Book extends NoTaxArticle {

	private String publisher;
	private int yearPublished;
	private String author;

	public Book(String universalCode, float price, String title, String publisher, int yearPublished, String author) {
		super(universalCode, price, title);
		this.publisher = publisher;
		this.yearPublished = yearPublished;
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
