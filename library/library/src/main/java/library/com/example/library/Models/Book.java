package library.com.example.library.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@Table (name="Books")
public class Book {
    @Id
    @Column(name="ISBN")
    private Long ISBN;
    @Column(name="Title")
    private  String title;
    @Column(name = "Author")
    private String author;
    @Column(name = "Total Copies Available")
    private Long totalCopiesAvailable;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Checkout> checkouts;
}
