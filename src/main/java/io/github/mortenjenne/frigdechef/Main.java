package io.github.mortenjenne.frigdechef;


import java.util.List;

public class Main {

    public static void main(String[] args) {
        MainView mainView = new MainView();

        RecipeManager manager = new RecipeManager();


        try {
            List<Dish> recipes = manager.getRecipesByCuisine("french");  // F.eks. søgning på 'pesto'
            for (Dish dish : recipes) {
                System.out.println("Title: " + dish.getTitle());
                System.out.println("ID: " + dish.getId());
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            }
        }



