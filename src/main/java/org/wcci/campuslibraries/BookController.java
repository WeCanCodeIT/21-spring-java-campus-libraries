package org.wcci.campuslibraries;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
    // 1. Provide mapping for methods.
    // 2. Find the data for the view.
    // 3. Add the data to the model object.
    // 4. Select the template to be displayed.

@Controller
public class BookController {
    private BookStorage bookStorage;

    public BookController(BookStorage bookStorage) {
        this.bookStorage = bookStorage;
    }

    @RequestMapping("/books/{title}")
    public String displaySingleBook(@PathVariable String title, Model model) {

        Book bookToDisplay = bookStorage.retrieveBookByTitle(title);
        model.addAttribute("book", bookToDisplay);

        return "single-book";
    }
}
