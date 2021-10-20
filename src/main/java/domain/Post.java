package domain;

import java.util.Date;

public class Post {
    private String id;
    private String author;
    private String description;
    private int date;
    private boolean pinPost;
    private boolean saveToBookmarks;
    private boolean copyLink;
    private boolean delete;
    private boolean complain;
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private RepostInfo repostInfo;
    private ViewsInfo viewsInfo;
    // + get/set на все поля
}
