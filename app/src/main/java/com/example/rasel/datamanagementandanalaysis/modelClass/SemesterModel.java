package com.example.rasel.datamanagementandanalaysis.modelClass;

/**
 * Created by ASUS on 11/19/2016.
 */

public class SemesterModel {

    String Name;
    private int CategoryId;
    private int SubCategoryId;
    private int SubID;

    public SemesterModel() {
    }

    public SemesterModel(String name, int categoryId, int subCategoryId, int
            subID) {
        Name = name;
        CategoryId = categoryId;
        SubCategoryId = subCategoryId;
        SubID = subID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    public int getSubCategoryId() {
        return SubCategoryId;
    }

    public void setSubCategoryId(int subCategoryId) {
        SubCategoryId = subCategoryId;
    }

    public void setSubID(int subID) {
        SubID = subID;
    }

    public int getSubID() {
        return SubID;
    }
}
