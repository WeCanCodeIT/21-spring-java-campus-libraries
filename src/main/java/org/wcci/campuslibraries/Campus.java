package org.wcci.campuslibraries;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;
@Entity
public class Campus {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String description;
    @OneToMany(mappedBy = "campus")
    Collection<Book> books;
    protected Campus(){
    }

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


    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Campus{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Campus campus = (Campus) o;

        if (id != campus.id) return false;
        if (name != null ? !name.equals(campus.name) : campus.name != null) return false;
        return description != null ? description.equals(campus.description) : campus.description == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
