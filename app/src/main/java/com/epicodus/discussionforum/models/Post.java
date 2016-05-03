package com.epicodus.discussionforum.models;

import org.parceler.Parcel;

@Parcel
public class Post {
        String title;
        String author;
        String body;

    public Post() {}

    public Post(String title, String author, String body) {
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



