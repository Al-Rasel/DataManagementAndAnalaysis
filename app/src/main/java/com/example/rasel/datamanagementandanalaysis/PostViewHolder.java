package com.example.rasel.datamanagementandanalaysis;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.rasel.datamanagementandanalaysis.modelClass.CategoryModel;

/**
 * Created by Rasel on 9/26/2016.
 */
public class PostViewHolder extends RecyclerView.ViewHolder {

    private TextView titleView;
    private TextView authorView;


    public PostViewHolder(View itemView) {
        super(itemView);
        titleView = (TextView) itemView.findViewById(R.id.count);
        authorView = (TextView) itemView.findViewById(R.id.CategoryName);


    }

    public void bindToPost(CategoryModel myDataset) {


        titleView.setText(String.valueOf(myDataset.getCategoryId()));
        authorView.setText(String.valueOf(myDataset.getCategoryName()));




       /* numStarsView.setText(String.valueOf(post.starCount));
        bodyView.setText(post.body);

        starView.setOnClickListener(starClickListener);*/
    }

}
