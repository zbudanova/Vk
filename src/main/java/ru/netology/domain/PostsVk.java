package ru.netology.domain;

public class PostsVk {
    private int id; // идентификатора записи
    private int ownerId; //Идентификатор владельца стены, на которой размещена запись.
    private int fromId; //Идентификатор автора записи
    private int createdBy; //Идентификатор администратора, который опубликовал запись
    private int data;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private int postType;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int canPinned;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponedId;

}
