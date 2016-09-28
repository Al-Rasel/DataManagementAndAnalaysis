package com.example.rasel.datamanagementandanalaysis;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Rasel on 9/26/2016.
 */
public class PostViewHolder extends RecyclerView.ViewHolder {

    public TextView titleView;
    public TextView authorView;


    public PostViewHolder(View itemView) {
        super(itemView);
        titleView = (TextView) itemView.findViewById(R.id.count);
        authorView = (TextView) itemView.findViewById(R.id.CategoryName);


    }

/*    public void bindToPost(CategoryModel myDataset) {






       *//* numStarsView.setText(String.valueOf(post.starCount));
        bodyView.setText(post.body);

        starView.setOnClickListener(starClickListener);*//*
    }*/

}
