package com.kh.practice.chap01_poly.model.vo;

public class Book {
	
   //�ʵ��
	private String title; //������
	private String author; //���ڸ�
	private String publisher; //���ǻ��
	
	//�����ں�
	public Book() {
	}
	public Book(String title,String author,String publiSher) {
		this.title=title;
		this.author=author;
		this.publisher=publiSher;
	}
	//�޼ҵ��
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
