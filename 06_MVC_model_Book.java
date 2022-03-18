package com.kh.practice.chap01_poly.model.vo;

public class Book {
	
   //필드부
	private String title; //도서명
	private String author; //저자명
	private String publisher; //출판사명
	
	//생성자부
	public Book() {
	}
	public Book(String title,String author,String publiSher) {
		this.title=title;
		this.author=author;
		this.publisher=publiSher;
	}
	//메소드부
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
	
	@Override
	public String toString() {
		return "title=" + title + ", author=" + author + ", publisher=" + publisher + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
