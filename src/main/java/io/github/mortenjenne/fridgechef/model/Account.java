package io.github.mortenjenne.fridgechef.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String userName;
    private String email;
    private String password;
    private List<Dish> favoriteDishes;
    private List<Fridge> fridge;

    public Account(String userName, String email, String password){
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.favoriteDishes = new ArrayList<>();
    }

    public String getUserName(){
        return this.userName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

    public List<Dish> getFavoriteDishes(){
        return this.favoriteDishes;
    }

    public void addToFavorites(Dish dish){
        this.favoriteDishes.add(dish);
    }

    public void removeFromFavorites(Dish dish){
        this.favoriteDishes.remove(dish);
    }

    public void addIngredientToFridge(Ingredient ingredient){

    }

    public void removeIngredientFromFridge(Ingredient ingredient){

    }





}
