package com.aciad.chatime.model;

public class Message {
    private String message;
    private String senderUid;

    public Message() {}

    public Message(String senderUid, String message) {
        this.senderUid = senderUid;
        this.message = message;
    }

    public String getSenderUid() {
        return senderUid;
    }

    public void setSenderUid(String senderUid) {
        this.senderUid = senderUid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
