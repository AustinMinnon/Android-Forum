package com.epicodus.discussionforum.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.epicodus.discussionforum.R;
import com.epicodus.discussionforum.models.Post;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class PostListAdapter extends RecyclerView.Adapter<PostListAdapter.PostViewHolder>{
    private ArrayList<Post> mPosts = new ArrayList<>();
    private Context mContext;

    public PostListAdapter(Context context, ArrayList<Post> posts){
        mContext = context;
        mPosts = posts;
    }

    @Override
    public PostListAdapter.PostViewHolder onCreateViewHolder(ViewGroup parentm int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_list_item, parent, false);

        PostViewHolder viewHolder= new PostViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(PostListAdapter.PostViewHolder holder, int position){
        holder.bindPost(mPosts.get(position));
    }

    @Override
    public int getItemCount() {
        return mPosts.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.authorTextView)TextView mAuthorTextView;
        @Bind(R.id.bodyTextView) TextView mBodyTextView;
        @Bind(R.id.titleTextView) TextView mTitleTextView;
        private Context mContext;

        public PostViewHolder(View itemView){
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();

        public void bindPost(Post post){
            mTitleTextView.setText(post.getTitle());
            mAuthorTextView.setText(post.getAuthor());
            mBodyTextView.setText(post.getBody());
        }
    }
}
