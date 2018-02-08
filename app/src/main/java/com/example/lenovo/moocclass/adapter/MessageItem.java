package com.example.lenovo.moocclass.adapter;



/**
 * Created by Lenovo on 2018/2/5.
 */

public class MessageItem {

    private int color;
    private int iconId;
    private String messageTitle;
    private String messageContent;

    public MessageItem(int color,int iconId,String messageTitle,String messageContent){
        this.color = color;
        this.iconId = iconId;
        this.messageTitle = messageTitle;
        this.messageContent = messageContent;
    }

    public int getIconId() {
        return iconId;
    }

    public int getColor() {
        return color;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }
}
