package org.wcci.campuslibraries;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

    private BookStorage bookStorage;

    public Populator(BookStorage bookStorage){
        this.bookStorage = bookStorage;
    }
    @Override
    public void run(String... args) throws Exception {
        Campus moon = new Campus("THE MOON", "IT's IN OUTER SPACE.");
        Book moonBook = new Book("Living on the Moon", "Neil Armstrong", "http://placekitten.com/300/200",
                "This book is about living on the moon", moon);
        bookStorage.saveBook(moonBook);

        Campus virtual = new Campus("Virtual", "Streamed to your home.");
        Book headFirstJava = new Book("Head First Java", "Kathy Sierra",
                "http://placekitten.com/300/200", "Great book to learn Java",virtual);
        bookStorage.saveBook(headFirstJava);


    }
}
