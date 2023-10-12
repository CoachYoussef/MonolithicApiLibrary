package library.com.example.library.Services;

import library.com.example.library.Models.Book;
import library.com.example.library.Models.DTO.BookDTO;
import library.com.example.library.Repositories.BookRepository;
import library.com.example.library.Utils.BookMapperProfile;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BookService {
    private BookRepository bookRepository;

    public List<BookDTO> getAllBooks(){
        return bookRepository.findAll().stream()
                .map(b -> BookMapperProfile.mapToDto(b))
                .collect(Collectors.toList());
    }

    public BookDTO getBookById(Long id){
        Optional<Book> byId = bookRepository.findById(id);
        if(byId.isPresent())
        {
            return BookMapperProfile.mapToDto(byId.get());
        }

        return null;
    }

    public Boolean deleteById(Long id){

        Optional<Book> byId = bookRepository.findById(id);
        if(byId.isPresent())
        {
            bookRepository.deleteById(id);
            return true;
        }
        return false;
    }


}
