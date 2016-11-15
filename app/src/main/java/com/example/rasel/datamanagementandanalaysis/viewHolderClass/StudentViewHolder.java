package com.example.rasel.datamanagementandanalaysis.viewHolderClass;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.example.rasel.datamanagementandanalaysis.R;

/**
 * Created by Rasel on 9/28/2016.
 */

public class StudentViewHolder extends RecyclerView.ViewHolder {

    public TextView textViewForID;
    public TextView textViewForName;
    public TextView textViewForPresent;
    public ToggleButton toggleButtonForCalling;

    public StudentViewHolder(View itemView) {
        super(itemView);
        textViewForID = (TextView) itemView.findViewById(R.id.Student_ID);
        textViewForName = (TextView) itemView.findViewById(R.id.StudentName);
        textViewForPresent = (TextView) itemView.findViewById(R.id.tv_studentPresents);
        toggleButtonForCalling = (ToggleButton) itemView.findViewById(R.id.toggleButton);


    }
}
