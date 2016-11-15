package com.example.rasel.datamanagementandanalaysis;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.CompoundButton;

import com.example.rasel.datamanagementandanalaysis.modelClass.SubSubcategoryModel;
import com.example.rasel.datamanagementandanalaysis.viewHolderClass.StudentViewHolder;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class OneSessionStudentsActivity extends AppCompatActivity {

    RecyclerView recyclerViewStudent;
    FirebaseRecyclerAdapter<SubSubcategoryModel, StudentViewHolder> firebaseRecyclerAdapterForStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        Bundle extra = getIntent().getExtras();
        int subCategoryId = extra.getInt("subCategoryId");


        recyclerViewStudent = (RecyclerView) findViewById(R.id.recycler_student);

        recyclerViewStudent.setLayoutManager(new LinearLayoutManager(this));
        DatabaseReference databaseReference = MainActivity.database.getReference("array/SubSubcategories");

        Query queryForStudents = databaseReference.orderByChild("SubCategoryId").equalTo(subCategoryId);


        firebaseRecyclerAdapterForStudent = new FirebaseRecyclerAdapter<SubSubcategoryModel, StudentViewHolder>
                (SubSubcategoryModel.class, R.layout.recyler_student_layout,
                StudentViewHolder.class, queryForStudents

        ) {
            @Override
            protected void populateViewHolder(final StudentViewHolder viewHolder, final SubSubcategoryModel model, int position) {

                viewHolder.textViewForID.setText(String.valueOf(model.getSubSubCategoryId()));

                viewHolder.textViewForName.setText(model.getSubSubCategoryName());




                viewHolder.toggleButtonForCalling.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {

                            viewHolder.textViewForPresent.setText(String.valueOf(model.getSubSubCategoryId()));

                        } else {

                            viewHolder.textViewForPresent.setText(String.valueOf("0"));

                        }
                    }
                });


            }
        };


        recyclerViewStudent.setAdapter(firebaseRecyclerAdapterForStudent);

    }
}
