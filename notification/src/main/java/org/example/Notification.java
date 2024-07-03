package org.example;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private String message;

    private LocalDateTime sentTime;

    // Constructors, getters, setters, etc.

    // Getters and Setters
}
