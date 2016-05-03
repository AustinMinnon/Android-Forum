package com.epicodus.discussionforum.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.epicodus.discussionforum.R;
import com.epicodus.discussionforum.models.Post;

import org.parceler.Parcels;
import org.w3c.dom.Text;

import butterknife.Bind;
import butterknife.ButterKnife;

public class PostDetailFragment extends Fragment {
    @Bind(R.id.titleTextView) TextView mTitleTextView;
    @Bind(R.id.authorTextView) TextView mAuthorTextView;
    @Bind(R.id.bodyTextView) TextView mBodyTextView;

    private Post mPost;

    public static PostDetailFragment newInstance(Post post){
        PostDetailFragment postDetailFragment = new PostDetailFragment();
        Bundle args = new Bundle();
        args.putParcelable("post", Parcels.wrap(post));
        postDetailFragment.setArguments(args);
        return postDetailFragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mPost = Parcels.unwrap(getArguments().getParcelable("post"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_post_detail, container, false);
        ButterKnife.bind(this, view);

        mAuthorTextView.setText(mPost.getAuthor());
        mBodyTextView.setText(mPost.getBody());
        mTitleTextView.setText(mPost.getTitle());
        return view;
    }
}
