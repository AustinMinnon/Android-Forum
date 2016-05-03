package com.epicodus.discussionforum.models;

import org.parceler.Parcel;

@Parcel
public class Post {
        String title;
        String author;
        String body;
        String category;

    public Post() {}

    public Post(String title, String author, String body, String category) {
        this.title = title;
        this.author = author;
        this.body = body;
        this.category = category;

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

    public String getCategory() {
        return category;}
}



