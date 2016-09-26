package com.example.rasel.datamanagementandanalaysis;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rasel.datamanagementandanalaysis.modelClass.CategoryModel;

import java.util.List;

/**
 * Created by Rasel on 9/26/2016.
 */
public class imageShowRecylerAdapter extends RecyclerView.Adapter<imageShowRecylerAdapter.DataObjectHolder> {
    private String LOG_TAG = "MyRecyclerViewAdapter";
    private List<CategoryModel> mDataset;

    private Context context;
    String folderName;


    public imageShowRecylerAdapter(List<CategoryModel> myDataset, Context context) {
        this.mDataset = myDataset;
        this.context = context;


    }


    @Override
    public DataObjectHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.category_layout, parent, false);

        DataObjectHolder dataObjectHolder = new DataObjectHolder(view);
        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder(DataObjectHolder holder, final int position) {


  /*      final int imageCount = position + 1;

        final String imageLink = "http://cdn.ajkerdeal.com/Images/Deals/" + folderName + "/" + "smallImage" + imageCount + ".jpg";


        Glide
                .with(context)
                .load(imageLink)
                .thumbnail(0.1f)
                .crossFade()
                .into(holder.mArrowIconImageView);
        holder.mArrowIconImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mViewPager.setCurrentItem(position);
            }
        });
*/
        holder.titleView.setText(String.valueOf(mDataset.get(position).getCategoryId()));
        holder.authorView.setText(mDataset.get(position).getCategoryName());

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }


    public class DataObjectHolder extends RecyclerView.ViewHolder {
        public TextView titleView;
        public TextView authorView;


        public DataObjectHolder(View itemView) {
            super(itemView);
            titleView = (TextView) itemView.findViewById(R.id.count);
            authorView = (TextView) itemView.findViewById(R.id.CategoryName);


        }


    }


}