package edu.mirea.remselybokgosha.start.post.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommentDto {
    private Long id;
    private String content;
    private String author;
}
