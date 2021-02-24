package org.wcci.campuslibraries;

import org.springframework.stereotype.Service;
import org.wcci.campuslibraries.Author;
import org.wcci.campuslibraries.AuthorRepository;
import java.util.Optional;

@Service
public class AuthorStorage {

    private AuthorRepository authorRepo;


    public AuthorStorage (AuthorRepository authorRepo){
        this.authorRepo = authorRepo;
    }
    public Author findAuthorById(Long id) {
        Optional<Author> authorOptional = authorRepo.findById(id);
        Author retrievedAuthor;

           retrievedAuthor= authorOptional.get();

        return retrievedAuthor;
    }

    public void save(Author authorToSave) {
        authorRepo.save(authorToSave);
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepo.findAll();
    }
}
