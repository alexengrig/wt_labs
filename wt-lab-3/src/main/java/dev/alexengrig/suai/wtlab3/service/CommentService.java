package dev.alexengrig.suai.wtlab3.service;

import dev.alexengrig.suai.wtlab3.domain.Comment;
import dev.alexengrig.suai.wtlab3.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<Comment> getComments() {
        return commentRepository.findAll();
    }

    public void createComment(String username, String text) {
        commentRepository.save(new Comment(username, text));
    }
}
