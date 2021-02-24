package org.wcci.campuslibraries;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private long id;
    private String title;

    public Book() {

    }

    public Collection<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Collection<Author> authors) {
        this.authors = authors;
    }

    @ManyToMany
    private Collection<Author> authors;
    private String authorName;
    private String imageUrl;
    private String description;
    @ManyToOne
    private Campus campus;

    public Book(String title, String imageUrl, String description, Campus campus) {
        this.title = title;
        this.authorName = authorName;
        this.imageUrl = imageUrl;
        this.description = description;
        this.campus = campus;
        this.campus.getBooks().add(this);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public Campus getCampus() {
        return campus;
    }

  /*  public void addAuthor(Author author){
        this.authors.add(author);
    }*/

}
