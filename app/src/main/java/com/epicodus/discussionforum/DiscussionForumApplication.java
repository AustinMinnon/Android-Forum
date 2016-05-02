package com.epicodus.discussionforum;

import android.app.Application;

import com.firebase.client.Firebase;

public class DiscussionForumApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
