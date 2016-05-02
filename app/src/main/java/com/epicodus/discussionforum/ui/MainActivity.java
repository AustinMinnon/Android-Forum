package com.epicodus.discussionforum.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.epicodus.discussionforum.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.newPostButton)
    Button mNewPostButton;
    @Bind(R.id.viewPostsButton)
    Button mViewPostsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mNewPostButton.setOnClickListener(this);
        mViewPostsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mNewPostButton) {
            Intent intent = new Intent(MainActivity.this, NewPostActivity.class);
            startActivity(intent);
        }
        if (v == mViewPostsButton){
            Intent intent2 = new Intent(MainActivity.this, ViewPostsActivity.class);
            startActivity(intent2);
        }
    }
}