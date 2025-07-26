package com.example.ticket_.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class StatusHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ticket_id", nullable = false)
    private Ticket ticket;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private LocalDateTime changedAt;

    @ManyToOne(optional = false)
    @JoinColumn(name = "changed_by", nullable = false)
    private User changedBy;

    // --- Constructors ---
    public StatusHistory() {
    }

    public StatusHistory(Ticket ticket, String status, LocalDateTime changedAt, User changedBy) {
        this.ticket = ticket;
        this.status = status;
        this.changedAt = changedAt;
        this.changedBy = changedBy;
    }

    // --- Getters and Setters ---
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getChangedAt() {
        return changedAt;
    }

    public void setChangedAt(LocalDateTime changedAt) {
        this.changedAt = changedAt;
    }

    public User getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(User changedBy) {
        this.changedBy = changedBy;
    }
}
