package io.github.mortenjenne.fridgechef.model;

import java.util.HashMap;
import java.util.Map;

public class Fridge {
    private Ingredient ingredient;
    private int amount;
    private Map<Ingredient,Integer> ingredientsInFridge;

    public Fridge(){
        this.ingredientsInFridge = new HashMap<>();
    }

    public void addIngredientToFridge(Ingredient ingredient, int quantity){
        this.ingredientsInFridge.put(ingredient,quantity);
    }

    public void removeIngredientFromFridge(Ingredient ingredient, int quantity){
        //TODO logic virker ikke her
        this.ingredientsInFridge.remove(ingredient,quantity);
    }

    public boolean useIngredient(String name){
        return false;
    }


}
