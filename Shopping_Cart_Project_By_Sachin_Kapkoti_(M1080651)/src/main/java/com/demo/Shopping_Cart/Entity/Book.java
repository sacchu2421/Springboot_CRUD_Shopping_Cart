package com.demo.Shopping_Cart.Entity;

import java.util.Objects;

import javax.persistence.Entity;

@Entity
public class Book extends Product {
	
	
	private String genre;
	private String Author;
	private String publications;
	
	
	public Book( String genre, String author, String publications ) {
		super();
		this.genre = genre;
		Author = author;
		this.publications = publications;
	}
     public Book() {
		
	}
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getPublications() {
		return publications;
	}
	public void setPublications(String publications) {
		this.publications = publications;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Author, genre, publications);
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
		return Objects.equals(Author, other.Author) && Objects.equals(genre, other.genre)
				&& Objects.equals(publications, other.publications);
	}

	@Override
	public String toString() {
		return "Book [genre=" + genre + ", Author=" + Author + ", publications=" + publications + "]";
	}

	

}
