package org.wcci.campuslibraries;

public class Book {
    private String title;
    private String authorName;
    private String imageUrl;
    private String description;
    private Campus campus;

    public Book(String title, String authorName, String imageUrl, String description, Campus campus) {
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

}
