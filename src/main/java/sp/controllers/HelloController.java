package sp.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sp.Component.ClientComponent;
import sp.models.Author;
import sp.models.Book;
import sp.repositories.AuthorsRepository;
import sp.repositories.BooksRepository;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class HelloController {

//    private final ClientComponent clientComponent;
    private final AuthorsRepository repository;
    private final BooksRepository repository1;

    @GetMapping
    @RequestMapping("/author")
    public String author(){
        Author A = new Author("John");
        repository.save(A);
        return "Hello"+ A.getId()+A.getName();

    }

 @GetMapping
 @RequestMapping("/book")
 public String book(){
     Book b = new Book("Moara cu noroc");
     repository1.save(b);
     return b.getTitle();
 }


}
