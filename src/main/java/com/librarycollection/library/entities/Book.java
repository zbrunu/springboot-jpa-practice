package com.librarycollection.library.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_book")
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bookId;

	private String title;

	private LocalDate releaseDate;

	private Integer stockQuantity;

	private Double unitPrice;

	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author;

	public Book() {
	}

	public Book(Long bookId, String title, LocalDate releaseDate, Integer stockQuantity, Double unitPrice,
			Author author) {
		this.bookId = bookId;
		this.title = title;
		this.releaseDate = releaseDate;
		this.stockQuantity = stockQuantity;
		this.unitPrice = unitPrice;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getreleaseDate() {
		return releaseDate;
	}

	public void setreleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Integer getstockQuantity() {
		return stockQuantity;
	}

	public void setstockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public Double getunitPrice() {
		return unitPrice;
	}

	public void setunitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Long getBookId() {
		return bookId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookId, other.bookId);
	}
	
}
