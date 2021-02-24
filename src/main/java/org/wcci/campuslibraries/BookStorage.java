package org.wcci.campuslibraries;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
// Store the Book objects
    // Provide a way to save new books.
    // Provide a way to retrieve a single book object.
    // Provide error handling.

@Service
public class BookStorage {
    private Map<String, Book> books;




    public BookStorage() {
        books = new HashMap<>();
    }
    public void saveBook(Book book){
        books.put(book.getTitle(), book);
    }
    public Book retrieveBookByTitle(String title) {
        return books.get(title );
    }
}
