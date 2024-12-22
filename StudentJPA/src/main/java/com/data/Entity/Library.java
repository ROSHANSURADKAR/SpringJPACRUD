package com.data.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Library {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String title;
	String author;
	int copies;

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Library(int id, String title, String author, int copies) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.copies = copies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}
}
