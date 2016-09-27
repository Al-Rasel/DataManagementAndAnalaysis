package com.example.rasel.datamanagementandanalaysis.modelClass;

/**
 * Created by Rasel on 9/26/2016.
 */


public class SubcategoryModel {

    private int CategoryId;
    private int SubCategoryId;
    private String SubCategoryName;

    public SubcategoryModel() {
    }

    public SubcategoryModel(int categoryId, int subCategoryId, String subCategoryName) {
        CategoryId = categoryId;
        SubCategoryId = subCategoryId;
        SubCategoryName = subCategoryName;
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

    public String getSubCategoryName() {
        return SubCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        SubCategoryName = subCategoryName;
    }


    @Override
    public String toString() {
        return "SubcategoryModel{" +
                "CategoryId=" + CategoryId +
                ", SubCategoryId=" + SubCategoryId +
                ", SubCategoryName='" + SubCategoryName + '\'' +
                '}';
    }
}
