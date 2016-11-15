package com.example.rasel.datamanagementandanalaysis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.rasel.datamanagementandanalaysis.modelClass.SubcategoryModel;
import com.example.rasel.datamanagementandanalaysis.viewHolderClass.PostViewHolder;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class SessionActivity extends AppCompatActivity {


    private RecyclerView recyclerViewForSemesters;
    private FirebaseRecyclerAdapter<SubcategoryModel, PostViewHolder> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);
        Bundle extra = getIntent().getExtras();
        int categoryId = extra.getInt("CategoryId");


        recyclerViewForSemesters = (RecyclerView) findViewById(R.id.recycler_semester);

        recyclerViewForSemesters.setLayoutManager(new LinearLayoutManager(this));


        //  Toast.makeText(this, String.valueOf(categoryId), Toast.LENGTH_LONG).show();

        DatabaseReference databaseReference = MainActivity.database.getReference("array/Subcategories");

        Query recentPostsQuery = databaseReference.orderByChild("CategoryId").equalTo(categoryId);

        mAdapter = new FirebaseRecyclerAdapter<SubcategoryModel, PostViewHolder>(SubcategoryModel.class, R.layout.category_layout,
                PostViewHolder.class, recentPostsQuery) {
            @Override
            protected void populateViewHolder(PostViewHolder viewHolder, final SubcategoryModel model, int position) {


                viewHolder.authorView.setText(String.valueOf(model.getSession()));

                viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(v.getContext(), OneSessionStudentsActivity.class);

                        intent.putExtra("subCategoryId", model.getSubCategoryId());
                        startActivity(intent);


                    }
                });


            }
        };
        recyclerViewForSemesters.setAdapter(mAdapter);


    }
}
