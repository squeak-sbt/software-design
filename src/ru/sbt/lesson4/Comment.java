package ru.sbt.lesson4;

public class Comment {
    private final String comment;
    private final String username;
    private final String ipAddress;

    public Comment(String comment, String username, String ipAddress) {
        this.comment = comment;
        this.username = username;
        this.ipAddress = ipAddress;
    }

    public String getComment() {
        return comment;
    }

    public String getUsername() {
        return username;
    }

    public String getIpAddress() {
        return ipAddress;
    }
}
