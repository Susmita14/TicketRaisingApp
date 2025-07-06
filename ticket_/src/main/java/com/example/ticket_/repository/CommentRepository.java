package com.example.ticket_.repository;

import com.example.ticket_.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    
}