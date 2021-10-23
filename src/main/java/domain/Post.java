package domain;

import java.util.Date;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private  int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private CommentsInfo commentsInfo;
    private CopyRight copyRight;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private String[] postType= {"post", "copy", "reply", "postpone", "suggest"};
    private PostSource postSource;
    private Geo geo;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private Donut donut;
    private int postponedId;
    // + get/set на все поля
}
