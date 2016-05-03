package com.epicodus.discussionforum.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.epicodus.discussionforum.Constants;
import com.epicodus.discussionforum.R;
import com.epicodus.discussionforum.adapters.FirebasePostListAdapter;
import com.epicodus.discussionforum.adapters.PostViewHolder;
import com.epicodus.discussionforum.models.Post;
import com.firebase.client.Firebase;
import com.firebase.client.Query;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;

public class ViewPostsActivity extends AppCompatActivity {
    @Bind(R.id.recyclerView) RecyclerView mRecyclerView;
    private Query mQuery;
    private Firebase mFirebasePostRef;
    private FirebasePostListAdapter mAdapter;
    public ArrayList<Post> mPosts = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_posts);
        ButterKnife.bind(this);
        mFirebasePostRef = new Firebase(Constants.FIREBASE_URL_POSTS);

        setUpFirebaseQuery();
        setUpRecyclerView();

    }

    private void setUpFirebaseQuery(){
        String post = mFirebasePostRef.toString();
        mQuery =  new Firebase(post);
    }

    private void setUpRecyclerView(){
        mAdapter = new FirebasePostListAdapter(mQuery, Post.class);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAdapter);
    }
}
