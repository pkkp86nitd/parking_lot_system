package org.example;


import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private Long parkingSpotId;

    private LocalDateTime bookingTime;

    private String status;
}
