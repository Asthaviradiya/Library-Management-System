package com.LMS;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;

    public Book(String isbn,String title,String author,int publicationYear){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
    }

    //getter method for isbn, author, publicationyear, available status

    public String getIsbn(){
        return isbn;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPublicationYear(){
        return publicationYear;
    }
    public boolean isAvailable(){
        return isAvailable;
    }

    // borrow method : if book borrowed by user this method makes availability status as false

    public void borrow(){
        isAvailable = false;
    }

    //return book method : when book is returned by user, this method makes availability status as true

    public void returnBook(){
        isAvailable = true;
    }
}
