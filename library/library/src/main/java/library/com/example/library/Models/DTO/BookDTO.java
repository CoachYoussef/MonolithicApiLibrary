package library.com.example.library.Models.DTO;

import jakarta.persistence.*;
import library.com.example.library.Models.Checkout;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
public class BookDTO {
    private Long ISBN;
    private  String title;
    private String author;
    private Long totalCopiesAvailable;
}
