package com.LMS;

import java.util.List;

public class LibraryManagementTest
{
    private Library library;

    // Initializes a new Library object before each test with the help of @BeforeEach annotation of JUnit 5
    @BeforeEach
    void setUp(){
        library = new Library();
    }

    // This test ensures that a new book can be added successfully
    @Test
    void testAddBook(){
        Book book = new Book("27102003","ABCD","Author1",2008);
        library.addBook(book);

        /*Test Case 1 : False expectation
        Assertions.assertEquals(0,library.getAvailableBooks().size());

        It gives an error because after adding a book actual result is 1
        But we gave false value as 0 so our function works correct
         */

        // Test Case 2 : True expectation
        Assertions.assertEquals(1,library.getAvailableBooks().size());
        Assertions.assertEquals(book,library.getAvailableBooks().get(0));
        System.out.println("Test case need to run successfully");
        // It runs correctly as we gave 1 as expected result and its equal to actual result
    }

    // This test ensures that book with duplicate ISBN is not allowed to add again if already added
    @Test
    void testAdBookWithDuplicateISBN(){
        Book book1 = new Book("27102004","ADCB","Author2",2006);
        Book book2 = new Book("27102004","ADCE","Author3",2007);
        library.addBook(book1);

        Assertions.assertFalse(library.addBook(book2));// Expecting false because isbn of book is same
        System.out.println("Test Case run successfully because due to duplicate isbn book is not added");
    }

    // This test ensures that book is borrowed by user successfully and its availability status set to false
    @Test
    void testBorrowBook(){
        Book book = new Book("27102003","XYZW","Author1",2002);
        library.addBook(book);

        Book borrowedBook = library.borrowBook("27102003");
        Assertions.assertNotNull(borrowedBook); // Test case run correctly if book with given ISBN was borrowed successfully

        // If book is Borrowed then its isAvailable status is false which is checked by following Assertion
        Assertions.assertFalse(borrowedBook.isAvailable());

        System.out.println("Both results are matched and test case run successfully");
    }
}
