package jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_table")
public class Book {

	@Id
	@Column(name = "isbn")
	private long isbn;

	@Column(name = "title")
	private String title;

	@Column(name = "price")
	private double price;

	public Book() {
		super();
	}

	public Book(int isbn, String title, double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}

}
