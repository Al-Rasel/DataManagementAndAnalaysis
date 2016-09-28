package com.example.rasel.datamanagementandanalaysis.modelClass;

/**
 * Created by Rasel on 9/26/2016.
 */


public class SubcategoryModel {

    private int CategoryId;
    private int SubCategoryId;
    private String SubCategoryName;

    private String SubCategoryNameInEnglish;

    public SubcategoryModel() {
    }

    public SubcategoryModel(int categoryId, int subCategoryId, String subCategoryName, String subCategoryNameInEnglish) {
        CategoryId = categoryId;
        SubCategoryId = subCategoryId;
        SubCategoryName = subCategoryName;
        SubCategoryNameInEnglish = subCategoryNameInEnglish;
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

    public String getSubCategoryNameInEnglish() {
        return SubCategoryNameInEnglish;
    }

    public void setSubCategoryNameInEnglish(String subCategoryNameInEnglish) {
        SubCategoryNameInEnglish = subCategoryNameInEnglish;
    }


    @Override
    public String toString() {
        return "SubcategoryModel{" +
                "CategoryId=" + CategoryId +
                ", SubCategoryId=" + SubCategoryId +
                ", SubCategoryName='" + SubCategoryName + '\'' +
                ", SubCategoryNameInEnglish='" + SubCategoryNameInEnglish + '\'' +
                '}';
    }
}
