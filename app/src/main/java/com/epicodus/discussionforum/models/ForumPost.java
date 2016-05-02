package com.epicodus.discussionforum.models;

//import org.parceler.Parcel;

public class ForumPost {
        String title;
        String author;
        String body;

            public ForumPost() {

            }


    public ForumPost (String title, String author, String body) {
        this.title = title;
        this.author = author;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }


    public String getBody() {
        return body;
    }

}



