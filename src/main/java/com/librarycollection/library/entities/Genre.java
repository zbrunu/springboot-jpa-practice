package com.librarycollection.library.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_genre")
public class Genre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long genreId;
	private String name;

	@OneToMany(mappedBy = "genre")
	private List<BooksGenre> bookGenres = new ArrayList<>();

	public Genre() {
	}

	public Genre(Long genreId, String name) {
		super();
		this.genreId = genreId;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getGenreId() {
		return genreId;
	}

	public List<BooksGenre> getBookGenres() {
		return bookGenres;
	}

	@Override
	public int hashCode() {
		return Objects.hash(genreId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Genre other = (Genre) obj;
		return Objects.equals(genreId, other.genreId);
	}

}
