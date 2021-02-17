package org.wcci.campuslibraries;

import java.util.ArrayList;
import java.util.Collection;

public class Campus {
    private String name;
    private String description;
    Collection<Book> books;

    public Campus(String name, String description) {
        this.name = name;
        this.description = description;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Collection<Book> getBooks() {
        return books;
    }
}
