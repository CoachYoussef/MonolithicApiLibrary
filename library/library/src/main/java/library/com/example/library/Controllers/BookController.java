package library.com.example.library.Controllers;

import library.com.example.library.Models.Book;
import library.com.example.library.Services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BookController {
    private BookService bookService;

    @GetMapping("/all")
    public List<Book> getAll(){

        return null;
    }

}
