//package com.epicodus.discussionforum.ui;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//
//import com.epicodus.discussionforum.Constants;
//import com.epicodus.discussionforum.R;
//import com.epicodus.discussionforum.adapters.FirebasePostListAdapter;
//import com.epicodus.discussionforum.models.Post;
//import com.firebase.client.Firebase;
//import com.firebase.client.Query;
//
//import butterknife.Bind;
//import butterknife.ButterKnife;
//
//
//public class SavedPostActivity extends AppCompatActivity {
//    private Query mQuery;
//    private Firebase mFirebasePostRef;
//    private FirebasePostListAdapter mAdapter;
//
//    @Bind(R.id.recyclerView) RecyclerView mRecyclerView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_view_posts);
//        ButterKnife.bind(this);
//
//        mFirebasePostRef = new Firebase(Constants.FIREBASE_URL_POSTS);
//
//        setUpFirebaseQuery();
//        setUpRecyclerView();
//    }
//
//    private void setUpFirebaseQuery() {
//        String location = mFirebasePostRef.toString();
//        mQuery = new Firebase(location);
//    }
//
//    private void setUpRecyclerView() {
//        mAdapter = new FirebasePostListAdapter(mQuery, Post.class);
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//        mRecyclerView.setAdapter(mAdapter);
//    }
//}
