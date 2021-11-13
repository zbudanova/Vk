package ru.netology.domain;

public class PostsVk {
    private int id;
    private String iconOwnerId; // аватарка (картинка) владельца страницы
    private int ownerId;
    private int fromId;
    private String iconFromId; // аватарка (картинка) владельца автора записи
    private int createdBy;
    private int data;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private CommentsInfo commentsInfo;
    private Copyright copyright;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private Views views;
    private int postType;
    private Geo geo;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int canPinned;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private Donut donut;
    private int postponedId;

}
