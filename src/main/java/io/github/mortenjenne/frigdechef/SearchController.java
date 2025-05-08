package io.github.mortenjenne.frigdechef;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.List;

public class SearchController {
    private RecipeManager recipeManager;

    @FXML
    private VBox recipeContainer;

    @FXML
    private Label fridgeLabel;

    public SearchController() {
        this.recipeManager = new RecipeManager(); // Brug RecipeManager
    }

    @FXML
    public void searchAndDisplayRecipes(String ingredients) {
        try {
            List<Recipe> recipes = recipeManager.getRecipesByTitle(ingredients);
            displayRecipes(recipes);
        } catch (Exception e) {
            fridgeLabel.setText("Error fetching recipes.");
        }
    }

    private void displayRecipes(List<Recipe> recipes) {
        recipeContainer.getChildren().clear();
        for (Recipe recipe : recipes) {
            Label recipeLabel = new Label(recipe.getTitle() + ": " + recipe.getId());
            recipeContainer.getChildren().add(recipeLabel);
        }
    }
}
