package com.kun.broccoli.controller;

import com.kun.broccoli.entity.Comment;
import com.kun.broccoli.mapper.CommentMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Comment")
public class CommentController {
    @Resource
    CommentMapper commentMapper;

    @CrossOrigin(origins = "*",maxAge = 3600)
    @GetMapping("/getCommentByRecipeId")
    public List<Comment> getCommentByRecipeId (String recipeId) {
        return commentMapper.getCommentByRecipeId(recipeId);
    }

    @CrossOrigin(origins = "*",maxAge = 3600)
    @GetMapping("/insertComment")
    public void insertComment (String recipeId,String userName,String time,String content) {
        commentMapper.insertComment(recipeId,userName,time,content);
    }
}
