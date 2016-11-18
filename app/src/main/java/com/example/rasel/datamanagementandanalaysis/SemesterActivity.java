package com.example.rasel.datamanagementandanalaysis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.rasel.datamanagementandanalaysis.modelClass.SubcategoryModel;
import com.example.rasel.datamanagementandanalaysis.viewHolderClass.PostViewHolder;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

/**
 * Created by ASUS on 11/18/2016.
 */

public class SemesterActivity extends AppCompatActivity {
    TextView textViewForSubcategoryID;
    int mSubCategoryID;
    String TAG = "SemesterActivity";
    RecyclerView mRecyclerView;
    FirebaseRecyclerAdapter mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);

        mRecyclerView = (RecyclerView) findViewById(R.id.idRecylerView);
        Bundle bundle = getIntent().getExtras();
        mSubCategoryID = bundle.getInt("subCategoryId");
        Log.e(TAG, "onCreate: ");

        LinearLayoutManager linearLayoutManagerForSemesterActivity = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(linearLayoutManagerForSemesterActivity);



        DatabaseReference databaseReference = MainActivity.database.getReference("array/Subcategories");

        Query recentPostsQuery = databaseReference.orderByChild("CategoryId").equalTo(mSubCategoryID);

        mAdapter = new FirebaseRecyclerAdapter<SubcategoryModel, PostViewHolder>(SubcategoryModel.class, R.layout.category_layout,
                PostViewHolder.class, recentPostsQuery) {
            @Override
            protected void populateViewHolder(PostViewHolder viewHolder, final SubcategoryModel model, int position) {


                viewHolder.authorView.setText(String.valueOf(model.getSession()));

                viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(v.getContext(), SemesterActivity.class);

                        intent.putExtra("subCategoryId", model.getSubCategoryId());
                        startActivity(intent);


                    }
                });


            }
        };
       mRecyclerView.setAdapter(mAdapter);



        textViewForSubcategoryID.setText(String.valueOf(mSubCategoryID));


    }
}
