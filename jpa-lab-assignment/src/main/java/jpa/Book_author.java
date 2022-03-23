package jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_author_table")
public class Book_author {

	@Id
	@Column(name = "book")
	private String book;

	@Column(name = "author")
	private String author;

	public Book_author() {
		super();
	}

	public Book_author(String book, String author) {
		super();
		this.book = book;
		this.author = author;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book and Author Info [Book=" + book + ", Author=" + author + "]";
	}

}
