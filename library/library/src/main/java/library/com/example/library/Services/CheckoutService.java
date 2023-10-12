package library.com.example.library.Services;

import library.com.example.library.Repositories.CheckoutRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CheckoutService {
    private CheckoutRepository checkoutRepository;

}
