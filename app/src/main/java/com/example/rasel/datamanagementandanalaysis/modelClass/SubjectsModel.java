package com.example.rasel.datamanagementandanalaysis.modelClass;

/**
 * Created by ASUS on 11/19/2016.
 */

public class SubjectsModel {

    String name;
    int SubCategoryId;


    public SubjectsModel() {
    }


    public SubjectsModel(String name, int subCategoryId) {
        this.name = name;
        SubCategoryId = subCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSubCategoryId() {
        return SubCategoryId;
    }

    public void setSubCategoryId(int subCategoryId) {
        SubCategoryId = subCategoryId;
    }
}
