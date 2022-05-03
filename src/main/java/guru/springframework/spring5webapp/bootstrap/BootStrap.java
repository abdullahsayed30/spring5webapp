package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.repos.AuthorRepo;
import guru.springframework.spring5webapp.repos.BookRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {

    private final AuthorRepo authorRepo;
    private final BookRepo bookRepo;

    public BootStrap(AuthorRepo authorRepo, BookRepo bookRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Author abdo = new Author("Abdullah", "Sallam");

        authorRepo.save(abdo);
        System.out.println(authorRepo.count());
    }
}
