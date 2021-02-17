package org.wcci.campuslibraries;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    // 1. Provide mapping for methods.
    // 2. Find the data for the view.
    // 3. Add the data to the model object.
    // 4. Select the template to be displayed.

    @RequestMapping("/single-book")
    public String displaySingleBook(Model model) {
        Campus campus = new Campus("MOON", "IT'S IN OUTER SPACE!");
        Book sampleBook = new Book("LIVING ON THE MOON!!!", "Neil Armstrong",
                "https://nineplanets.org/wp-content/uploads/2019/09/moon.png",
                 "BEST BOOK ON MOON LIVING!", campus);

        model.addAttribute("book", sampleBook);

        return "single-book";
    }
}
