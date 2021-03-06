package com.example.rasel.datamanagementandanalaysis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.rasel.datamanagementandanalaysis.modelClass.CategoryModel;
import com.example.rasel.datamanagementandanalaysis.modelClass.IST_ALL;
import com.example.rasel.datamanagementandanalaysis.viewHolderClass.PostViewHolder;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {
    String TAG = "MainActivity";
    private RecyclerView mRecycler;
    private LinearLayoutManager mManager;
    private FirebaseRecyclerAdapter<CategoryModel, PostViewHolder> mAdapter;
    private IST_ALL ist_all;
    private DatabaseReference myRef;
    static FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);
        FirebaseMessaging.getInstance().subscribeToTopic("ok");

        // TODO: Implement this method to send any registration to your app's servers.

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("array/Categories");
        // Query recentPostsQuery = myRef.orderByChild("CategoryId").equalTo(1);


        mRecycler = (RecyclerView) findViewById(R.id.messages_list);

        mManager = new LinearLayoutManager(this);

        mRecycler.setLayoutManager(mManager);


       /* myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                ist_all = dataSnapshot.getValue(IST_ALL.class);

                Log.d(TAG, "onDataChange: " + String.valueOf(ist_all));

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });*/

        mAdapter = new FirebaseRecyclerAdapter<CategoryModel, PostViewHolder>(CategoryModel.class, R.layout.category_layout,
                PostViewHolder.class, myRef) {
            @Override
            protected void populateViewHolder(PostViewHolder viewHolder, final CategoryModel model, final int position) {


                // viewHolder.bindToPost(model);



                viewHolder.authorView.setText(String.valueOf(model.getCategoryName()));


                viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        //  Toast.makeText(v.getContext(), "position = " + position, Toast.LENGTH_SHORT).show();


                        Intent next = new Intent(v.getContext(), SessionActivity.class);
                        next.putExtra("CategoryId", model.getCategoryId());

                        startActivity(next);

                    }
                });


            }


        };


        mRecycler.setAdapter(mAdapter);


    }


}
