package com.example.rasel.datamanagementandanalaysis.modelClass;

import android.provider.CalendarContract;

/**
 * Created by Rasel on 9/26/2016.
 */
public class SubSubcategoryModel {


    private int CategoryId;
    private int SubCategoryId;
    private int SubSubCategoryId;
    private String SubSubCategoryName;



    public SubSubcategoryModel() {
    }

    public SubSubcategoryModel(int subCategoryId, int categoryId, String subSubCategoryName, int subSubCategoryId) {
        SubCategoryId = subCategoryId;
        CategoryId = categoryId;
        SubSubCategoryName = subSubCategoryName;
        SubSubCategoryId = subSubCategoryId;
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

    public String getSubSubCategoryName() {
        return SubSubCategoryName;
    }

    public void setSubSubCategoryName(String subSubCategoryName) {
        SubSubCategoryName = subSubCategoryName;
    }

    public int getSubSubCategoryId() {
        return SubSubCategoryId;
    }

    public void setSubSubCategoryId(int subSubCategoryId) {
        SubSubCategoryId = subSubCategoryId;
    }

    @Override
    public String toString() {
        return "SubSubcategoryModel{" +
                "CategoryId=" + CategoryId +
                ", SubCategoryId=" + SubCategoryId +
                ", SubSubCategoryId=" + SubSubCategoryId +
                ", SubSubCategoryName='" + SubSubCategoryName + '\'' +
                '}';
    }
}
