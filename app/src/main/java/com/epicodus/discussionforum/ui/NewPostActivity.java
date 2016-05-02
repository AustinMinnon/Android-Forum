package com.epicodus.discussionforum.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.epicodus.discussionforum.Constants;
import com.epicodus.discussionforum.R;
import com.epicodus.discussionforum.models.Post;
import com.firebase.client.Firebase;

import butterknife.Bind;
import butterknife.ButterKnife;

public class NewPostActivity extends AppCompatActivity implements View.OnClickListener {


    private String title;
    private String author;
    private String body;
    @Bind(R.id.titleEditText) EditText mTitleEditText;
    @Bind(R.id.authorEditText) EditText mAuthorEditText;
    @Bind(R.id.bodyEditText) EditText mBodyEditText;
    @Bind(R.id.submitButton) Button mSubmitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_post);
        ButterKnife.bind(this);

        mSubmitButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == mSubmitButton) {
           Post newPost = new Post(mTitleEditText.getText().toString(), mAuthorEditText.getText().toString(), mBodyEditText.getText().toString());
            Firebase ref = new Firebase(Constants.FIREBASE_URL_POSTS);
            ref.push().setValue(newPost);
            Intent backToMain = new Intent(NewPostActivity.this, MainActivity.class);
            startActivity(backToMain);
        }
    }
}
