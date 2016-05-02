package com.epicodus.discussionforum.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.epicodus.discussionforum.R;
import com.epicodus.discussionforum.models.Post;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class PostViewHolder extends RecyclerView.ViewHolder {
    @Bind(R.id.titleTextView) TextView mTitleTextView;
    @Bind(R.id.authorTextView) TextView mAuthorTextView;
    @Bind(R.id.bodyTextView) TextView mBodyTextView;

    private Context mContext;
    private ArrayList<Post> mPosts = new ArrayList<>();

    public PostViewHolder(View itemView, ArrayList<Post> posts){
        super(itemView);
        ButterKnife.bind(this, itemView);
        mContext = itemView.getContext();
        mPosts = posts;
        itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int itemPosition = getLayoutPosition();
                Intent intent = new Intent(mContext, PostDetailActivity.class);
                intent.putExtra("position", itemPosition + "");
                intent.putExtra("posts", Parcels.wrap(mPosts));
                mContext.startActivity(intent);
            }
        });
    }

    public void bindRestaurant(Post post) {

        mTitleTextView.setText(post.getTitle());
        mAuthorTextView.setText(post.getBody());
        mBodyTextView.setText(post.getAuthor());
    }
}
