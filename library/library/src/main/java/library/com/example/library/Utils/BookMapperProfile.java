package library.com.example.library.Utils;

import library.com.example.library.Models.Book;
import library.com.example.library.Models.DTO.BookDTO;

public class BookMapperProfile {
    public static BookDTO mapToDto(Book book){
        return new BookDTO(book.getISBN(),
                book.getTitle(),
                book.getAuthor(),
                book.getTotalCopiesAvailable());
    }

    public static Book mapToEntity(BookDTO bookDto){
        return new Book(bookDto.getISBN(),
                bookDto.getTitle(),
                bookDto.getAuthor(),
                bookDto.getTotalCopiesAvailable(),null);
    }
}
