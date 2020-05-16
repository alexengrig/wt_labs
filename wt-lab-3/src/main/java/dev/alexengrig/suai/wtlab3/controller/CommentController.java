package dev.alexengrig.suai.wtlab3.controller;

import dev.alexengrig.suai.wtlab3.service.CommentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comments")
public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping
    public String getComments(Model model) {
        model.addAttribute("comments", commentService.getComments());
        return "comments";
    }

    @PostMapping
    public String addComments(String username, String text, Model model) {
        commentService.createComment(username, text);
        return getComments(model);
    }
}
