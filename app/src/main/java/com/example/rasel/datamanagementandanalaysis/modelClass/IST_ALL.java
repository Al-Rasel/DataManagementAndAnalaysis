package com.example.rasel.datamanagementandanalaysis.modelClass;

import java.util.List;

/**
 * Created by Rasel on 9/26/2016.
 */


public class IST_ALL {


    private List<CategoryModel> Categories;
    private List<SubcategoryModel> Subcategories;

    private List<SubSubcategoryModel> SubSubcategories;


    public IST_ALL() {


    }

    public IST_ALL(List<CategoryModel> categories, List<SubcategoryModel> subcategories,
                   List<SubSubcategoryModel> subSubcategories) {
        this.Categories = categories;
        this.Subcategories = subcategories;
        this.SubSubcategories = subSubcategories;
    }

    public List<CategoryModel> getCategories() {
        return Categories;
    }

    public List<SubcategoryModel> getSubcategories() {
        return Subcategories;
    }

    public List<SubSubcategoryModel> getSubSubcategories() {
        return SubSubcategories;
    }

    @Override
    public String toString() {
        return "IST_ALL{" +
                "Categories=" + Categories +
                ", Subcategories=" + Subcategories +
                ", SubSubcategories=" + SubSubcategories +
                '}';
    }
}
