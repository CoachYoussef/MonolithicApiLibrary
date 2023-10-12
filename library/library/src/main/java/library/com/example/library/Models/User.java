package library.com.example.library.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
public class User {
    @Id
    @Column(name="Email")
    private String email;
    @Column(name="Name")
    private String name;
    @Column(name="Membership")
    private String membership; // regular, premium ...

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Checkout> checkouts;

}
