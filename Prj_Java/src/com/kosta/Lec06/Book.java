package com.kosta.Lec06;

public class Book {
	String title;
	String author;
	int ISBN;

	public Book() { //1(기본생성자) -> 3호출
		this(null, null, 0); //this()로 Book(Stiring title, String author, int ISBN) 생성자를 호출
		System.out.println("생성자가 호출되었음 2");
	}

	public Book(String title, int ISBN) { 
		this(title, "Anonymous", ISBN);
		// this()로 Book(Stiring title, String author, int ISBN) 생성자를 호출
		System.out.println("생성자가 호출되었음 1");
	}
	
	public Book(String title, String author, int ISBN) { //3
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		System.out.println("객체 생성!");
	}

	public static void main(String[] args) {
		Book javaBook = new Book("Java Book", "Author Name", 3333);
        
		System.out.println(javaBook.title); 
        System.out.println(javaBook.author); 
        System.out.println(javaBook.ISBN);
		
		System.out.println("--------------------------------");
		
		
		Book theBible = new Book("The Bible", 1);
		System.out.println(theBible.title);
		System.out.println(theBible.ISBN);
		
		
		Book emptyBook = new Book();
		
	}
}








