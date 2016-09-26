package com.example.rasel.datamanagementandanalaysis.modelClass;

/**
 * Created by Rasel on 9/26/2016.
 */
public class CategoryModel {


    private int CategoryId;
    private String CategoryName;


    public CategoryModel() {
    }

    public CategoryModel(int categoryId, String categoryName) {
        CategoryId = categoryId;
        CategoryName = categoryName;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }


    @Override
    public String toString() {
        return "CategoryModel{" +
                "CategoryId=" + CategoryId +
                ", CategoryName='" + CategoryName + '\'' +
                '}';
    }
}
