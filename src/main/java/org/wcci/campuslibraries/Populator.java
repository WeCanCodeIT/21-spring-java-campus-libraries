package org.wcci.campuslibraries;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Component
public class Populator implements CommandLineRunner {

    private BookStorage bookStorage;
    private AuthorStorage authorStorage;

    public Populator(BookStorage bookStorage, AuthorStorage authorStorage){
        this.bookStorage = bookStorage;
        this.authorStorage = authorStorage;

    }
    @Override
    public void run(String... args) throws Exception {
        Campus moon = new Campus("THE MOON", "IT's IN OUTER SPACE.");

        Book moonBook = new Book("Living on the Moon", "http://placekitten.com/300/200",
                "This book is about living on the moon", moon);
        bookStorage.saveBook(moonBook);

        Campus virtual = new Campus("Virtual", "Streamed to your home.");
        Book headFirstJava = new Book("Head First Java",
                "http://placekitten.com/300/200", "Great book to learn Java",virtual);

        ArrayList<Author> list = new ArrayList<>();
        //Author author1 = new Author("Bert", "Bates");
        //Author author2 = new Author("Kathy", "Sierra");
        list.add(new Author("Bert", "Bates"));
        list.add(new Author("Kathy", "Sierra"));
        headFirstJava.setAuthors(list);
        bookStorage.saveBook(headFirstJava);

        authorStorage.save(new Author("Kathy", "Sierra"));
        authorStorage.save(new Author("Bert", "Bates"));




    }
}
