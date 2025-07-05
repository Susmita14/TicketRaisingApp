package com.example.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "feedback")
public class Feedback {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 1000)
    private String message;

    @Column(length = 10)
    private String rating; // Optional: could be GOOD/BAD, 1–5, etc.

    private LocalDateTime submittedAt = LocalDateTime.now();

    // User who submitted the feedback
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Optional: if feedback is linked to a ticket
    // @ManyToOne
    // @JoinColumn(name = "ticket_id")
    // private Ticket ticket;

    // Getters and setters
}
