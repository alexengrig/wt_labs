package dev.alexengrig.suai.wtlab3.repository;

import dev.alexengrig.suai.wtlab3.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
