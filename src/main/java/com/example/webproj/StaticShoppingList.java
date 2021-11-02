package com.example.webproj;

import com.example.webproj.models.Product;

import java.util.ArrayList;
import java.util.List;

public class StaticShoppingList {
    private static final List<Product> _shoppingList = new ArrayList<>();

    public static void add(String item){
        _shoppingList.add(new Product(_shoppingList.size()+1, item));
    }
    public static void add(Product item){
        _shoppingList.add(item);
    }

    public static void remove(int id){
        _shoppingList.remove(id-1);
    }

    public static List<Product> getAll(){
        return _shoppingList;
    }

    public static Product get(int id){
        return _shoppingList.get(id-1);
    }
}
