/*
One Ticket ➡️ Many Comments
Every ticket can have multiple comments (updates/statuses added by the user).

One Comment ➡️ One Ticket
Each comment belongs to one ticket only.

*/
package com.example.ticket_.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Comment { 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private String username; // the user who commented (for record)

    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    public Comment() {
        this.createdAt = LocalDateTime.now(); // set current time by default
    }

    public Comment(String content, String username, Ticket ticket) {
        this.content = content;
        this.username = username;
        this.ticket = ticket;
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
