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

import com.epicodus.discussionforum.R;
import com.epicodus.discussionforum.adapters.PostListAdapter;
import com.epicodus.discussionforum.adapters.PostViewHolder;
import com.epicodus.discussionforum.models.Post;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;

public class ViewPostsActivity extends AppCompatActivity {

@Bind(R.id.recyclerView)
    RecyclerView mRecyclerView;
    private PostListAdapter mAdapter;
    public ArrayList<Post> mPosts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_posts);
        ButterKnife.bind(this);
    }


    ViewPostsActivity.this.runOnUiThread(new Runnable() {
        public void run(){
            mAdapter = new PostListAdapter(getApplicationContext(), mPosts);
            mRecyclerView.setAdapter(mAdapter);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ViewPostsActivity.this);
            mRecyclerView.setLayoutManager(layoutManager);
            mRecyclerView.setHasFixedSize(true);

        }
    }
}
