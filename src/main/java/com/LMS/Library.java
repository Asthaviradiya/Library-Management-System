package com.LMS;

//import Arraylist class for dynamic list of books
import java.util.ArrayList;

// import List interface for working with collections of books
import java.util.List;

public class Library
{
    public List<Book> books;

//    Initialize book list with empty Arraylist whenever object of books is created
public Library()
{
    books = new ArrayList<Book>();
}

//    addBook method : this method is used to add book
public boolean addBook(Book book){
    for(Book b : books){
        if(b.getIsbn().equals(book.getIsbn())){
            return false;
        }
    }
    books.add(book);
    return true;
}
}
