package warmer.star.blog.service;

import warmer.star.blog.model.Comment;

import java.util.List;


public interface CommentService {
    List<Comment> getCommentList(String uuid);
    List<Comment> getChildComment(String uuid,Integer pid);
    int saveComment(Comment submitItem);
    boolean updateComment(Comment submitItem);
    boolean deleteComment(int CommentId);

}
