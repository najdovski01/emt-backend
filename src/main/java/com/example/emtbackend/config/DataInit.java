package com.example.emtbackend.config;

import com.example.emtbackend.model.Author;
import com.example.emtbackend.model.Country;
import com.example.emtbackend.model.enumerations.Category;
import com.example.emtbackend.service.AuthorService;
import com.example.emtbackend.service.BookService;
import com.example.emtbackend.service.CountryService;

import javax.annotation.*;

import static com.example.emtbackend.model.enumerations.Category.*;

public class DataInit {

    private final AuthorService authorService;
    private final CountryService countryService;
    private final BookService bookService;

    public DataInit(AuthorService authorService, CountryService countryService, BookService bookService) {
        this.authorService = authorService;
        this.countryService = countryService;
        this.bookService = bookService;
    }

    @PostConstruct
    public void initData() {
        Country country1 = new Country("Macedonia", "Europe");
        Country country2 = new Country("England", "Europe");
        Country country3 = new Country("USA", "North America");
        Country country4 = new Country("China", "Asia");

        countryService.create(country1);
        countryService.create(country2);
        countryService.create(country3);
        countryService.create(country4);

        Author author1 = new Author("Lu", "Xun", country4);
        Author author2 = new Author("Sun", "Tzu", country4);
        Author author3 = new Author("Kurt", "Vonnegut", country3);
        Author author4 = new Author("T.S.", "Elliot", country3);
        Author author5 = new Author("Georgi", "Pulevski", country1);
        Author author6 = new Author("John ", "Milton", country2);
        Author author7 = new Author("Lao", "Tzu", country4);
        Author author8 = new Author("Anton", "Panov", country1);
        Author author9 = new Author("Ellery", "Lloyd", country2);
        Author author10 = new Author("John", "Donne", country2);
        Author author11 = new Author("Herman", "Melville", country3);
        Author author12 = new Author("Pande", "Petrovski", country1);

        authorService.create(author1);
        authorService.create(author2);
        authorService.create(author3);
        authorService.create(author4);
        authorService.create(author5);
        authorService.create(author6);
        authorService.create(author7);
        authorService.create(author8);
        authorService.create(author9);
        authorService.create(author10);
        authorService.create(author11);
        authorService.create(author12);

        this.bookService.create("Posleden Zbor", BIOGRAPHY, author12.getId(), 5);
        this.bookService.create("Rechnik od tri jazika", HISTORY, author5.getId(), 7);
        this.bookService.create("Pecalbari", NOVEL, author8.getId(), 20);
        this.bookService.create("Gone girl", THRILLER, author2.getId(), 4);
        this.bookService.create("Little Women", CLASSICS, author6.getId(), 20);
        this.bookService.create("Jane Eyre", CLASSICS, author7.getId(), 4);
        this.bookService.create("The Match", NOVEL, author3.getId(), 10);
        this.bookService.create("The Moviegoer", DRAMA, author1.getId(), 13);
        this.bookService.create("Verity", THRILLER, author4.getId(), 11);
        this.bookService.create("One Italian Summer", DRAMA, author11.getId(), 3);
        this.bookService.create("Housekeeping", NOVEL, author10.getId(), 8);
        this.bookService.create("The Paris Apartment", FANTASY, author9.getId(), 9);
    }
}
