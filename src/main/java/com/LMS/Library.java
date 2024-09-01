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

//   borrowBook method : this method is used to borrow book
public Book borrowBook(String isbn){
    // checking that required book is currently available or not from list of books
    for(Book book : books){
        if(book.getIsbn().equals(isbn) && book.isAvailable()){
            book.borrow();
            return book;
        }
    }
    return null; // Book not found or not available
}

//    returnBook method : this method is for return book
public void returnBook(Book book){
    // checking that returned book belongs to our list of books and currently its availability status is false
    if(books.contains(book) && !book.isAvailable()){
        book.returnBook();
    }
}

//   getAvailableBook method : return list of available books
public List<Book> getAvailableBooks(){
    List<Book> availableBooks = new ArrayList<Book>();

    // Checking for each book that if it is available then it is added to availableBooks arrayList and then this list of all available book is returned
    for(Book book : books){
        if(book.isAvailable()){
            availableBooks.add(book);
        }
    }
    return availableBooks;
}

}
