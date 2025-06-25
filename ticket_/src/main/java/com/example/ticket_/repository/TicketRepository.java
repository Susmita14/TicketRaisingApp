package com.example.ticket_.repository;

import com.example.ticket_.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


/*
🧠 Why use interface and not class?
Spring Boot automatically generates the implementation for interfaces like JpaRepository, which provides powerful built-in methods like:
save()
findAll()
findById()
deleteById(), etc.

If you make it a class, you’ll have to write all those functions yourself 
 */
@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    // You can add custom queries here if needed later
}