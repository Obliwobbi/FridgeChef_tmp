package io.github.mortenjenne.frigdechef;


import java.util.List;

public class Main {

    public static void main(String[] args) {
        MainView mainView = new MainView();

        RecipeManager manager = new RecipeManager();


        try {
            List<Recipe> recipes = manager.getRecipesByCuisine("french");  // F.eks. søgning på 'pesto'
            for (Recipe recipe : recipes) {
                System.out.println("Title: " + recipe.getTitle());
                System.out.println("ID: " + recipe.getId());
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            }
        }



