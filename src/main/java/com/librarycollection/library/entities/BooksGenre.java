package com.librarycollection.library.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class BooksGenre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bookGenresId;

	@ManyToOne
	@JoinColumn(name = "genreId")
	private Genre genre;

	@ManyToOne
	@JoinColumn(name = "bookId")
	private Book book;

	public BooksGenre() {
		super();
	}

	public BooksGenre(Long bookGenresId, Genre genre, Book book) {
		super();
		this.bookGenresId = bookGenresId;
		this.genre = genre;
		this.book = book;
	}

	public Long getBookGenresId() {
		return bookGenresId;
	}

	public Genre getGenre() {
		return genre;
	}

	public Book getBook() {
		return book;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookGenresId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BooksGenre other = (BooksGenre) obj;
		return Objects.equals(bookGenresId, other.bookGenresId);
	}

}
