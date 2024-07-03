package org.example;



import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long bookingId;

    private BigDecimal amount;

    private LocalDateTime paymentTime;

    private String status; // e.g., 'paid', 'pending'
}

