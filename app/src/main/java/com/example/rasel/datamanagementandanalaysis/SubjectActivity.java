package com.example.rasel.datamanagementandanalaysis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.rasel.datamanagementandanalaysis.modelClass.SubjectsModel;
import com.example.rasel.datamanagementandanalaysis.viewHolderClass.PostViewHolder;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

/**
 * Created by ASUS on 11/18/2016.
 */

public class SubjectActivity extends AppCompatActivity {

    int mSubCategoryID;
    int mSubID;
    String TAG = "SemesterActivity";
    RecyclerView mRecyclerView;
    FirebaseRecyclerAdapter mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);

        mRecyclerView = (RecyclerView) findViewById(R.id.idRecylerView);
        Bundle bundle = getIntent().getExtras();
        mSubCategoryID = bundle.getInt("subCategoryId");
        mSubID = bundle.getInt("subID");
        Log.e(TAG, "onCreate: ");
        getSupportActionBar().setTitle("Subject");

        LinearLayoutManager linearLayoutManagerForSemesterActivity = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(linearLayoutManagerForSemesterActivity);


        DatabaseReference databaseReference = MainActivity.database.getReference("/array/Subjects");

        Log.e(TAG, "checkSub" + String.valueOf(mSubCategoryID));

        Query recentPostsQuery = databaseReference.orderByChild("SubID").equalTo(mSubID);

        mAdapter = new FirebaseRecyclerAdapter<SubjectsModel, PostViewHolder>(SubjectsModel.class, R.layout.category_layout,
                PostViewHolder.class, recentPostsQuery) {
            @Override
            protected void populateViewHolder(PostViewHolder viewHolder, final SubjectsModel model, int position) {


                viewHolder.titleView.setText(String.valueOf(model.getName()));

                viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(v.getContext(), OneSessionStudentsActivity.class);

                        intent.putExtra("subCategoryId", model.getSubCategoryId());
                        intent.putExtra("subName",model.getName());
                        startActivity(intent);


                    }
                });


            }
        };
        mRecyclerView.setAdapter(mAdapter);


//        textViewForSubcategoryID.setText(String.valueOf(mSubCategoryID));


    }
}
