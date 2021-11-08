package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private int canPost;
    private int groupsCanPost;
    private boolean canClose;
    private boolean canOpen;
    private String canAnswer; // поле для ответа на комментарии
    private int canPublish; // возможность поделиться комментарием (1- да, 0- нет)
    private int like; // поставить лайк на комментарий

}
