package edu.mirea.remselybokgosha.start.post.service;

import edu.mirea.remselybokgosha.start.post.dto.CommentCreationDto;
import edu.mirea.remselybokgosha.start.post.dto.CommentDto;
import edu.mirea.remselybokgosha.start.post.dto.PostDto;
import edu.mirea.remselybokgosha.start.post.dto.PostWithCommentsDto;
import edu.mirea.remselybokgosha.start.post.entity.Post;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface PostService {
    PostDto savePost(Post post, MultipartFile image, long userId);

    PostWithCommentsDto getPost(long postId, long userId);

    List<PostDto> getAllPosts(long userId);

    void savePostLike(long postId, long userId);

    void removePostLike(long postId, long userId);

    CommentDto saveComment(CommentCreationDto commentDto, long postId, long userId);
}
