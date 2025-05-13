package io.github.mortenjenne.fridgechef.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fridge {
    private Ingredient ingredient;
    private int amount;
    private List<Ingredient> ingredientsInFridge;

    public Fridge(){
        this.ingredientsInFridge = new ArrayList<>();
    }

    public void addIngredientToFridge(Ingredient ingredient){
        this.ingredientsInFridge.add(ingredient);
    }

    public void removeIngredientFromFridge(Ingredient ingredient){
        //TODO logic virker ikke her
        this.ingredientsInFridge.remove(ingredient);
    }

    public boolean useIngredient(String name){
        return false;
    }

    public List<Ingredient> getIngredientsInFridge(){
        return this.ingredientsInFridge;
    }


}
