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

    private String SubSubImageLink;



    public SubSubcategoryModel() {
    }

    public SubSubcategoryModel(int subCategoryId, int categoryId, String subSubCategoryName, int subSubCategoryId,String subSubImageLink) {
        SubCategoryId = subCategoryId;
        CategoryId = categoryId;
        SubSubCategoryName = subSubCategoryName;
        SubSubCategoryId = subSubCategoryId;
        SubSubImageLink=subSubImageLink;
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

    public void setSubSubImageLink(String subSubImageLink) {
        SubSubImageLink = subSubImageLink;
    }

    public String getSubSubImageLink() {
        return SubSubImageLink;
    }
}
