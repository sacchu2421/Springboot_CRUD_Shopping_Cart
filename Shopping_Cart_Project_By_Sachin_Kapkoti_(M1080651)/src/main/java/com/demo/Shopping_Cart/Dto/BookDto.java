package com.demo.Shopping_Cart.Dto;

import java.util.Objects;

public class BookDto {
	
	private String genre;
	private String Author;
	private String publications;
	
	
	public BookDto( String genre, String author, String publications ) {
		super();
		this.genre = genre;
		Author = author;
		this.publications = publications;
	}
     public BookDto() {
		
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
	public String toString() {
		return "BookDto [genre=" + genre + ", Author=" + Author + ", publications=" + publications + "]";
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
		BookDto other = (BookDto) obj;
		return Objects.equals(Author, other.Author) && Objects.equals(genre, other.genre)
				&& Objects.equals(publications, other.publications);
	}

}
