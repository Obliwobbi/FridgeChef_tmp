package io.github.mortenjenne.frigdechef;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.List;

public class Controller {
    private RecipeManager manager = new RecipeManager();

    @FXML private ImageView recipeImage1, recipeImage2, recipeImage3;
    @FXML private Label recipeTitle1, recipeTitle2, recipeTitle3;
    @FXML private TextField searchField;
    @FXML private Button searchButton;

    @FXML
    public void initialize() {
        searchButton.setOnAction(event -> searchRecipe());
    }

    public void searchRecipe() {
        String query = searchField.getText();
        try {
            List<Recipe> recipes = manager.getRecipesByTitle(query);

            if (recipes.size() >= 3) {
                recipeImage1.setImage(new Image(recipes.get(0).getImageUrl()));
                recipeTitle1.setText(recipes.get(0).getTitle());

                recipeImage2.setImage(new Image(recipes.get(1).getImageUrl()));
                recipeTitle2.setText(recipes.get(1).getTitle());

                recipeImage3.setImage(new Image(recipes.get(2).getImageUrl()));
                recipeTitle3.setText(recipes.get(2).getTitle());
            }

        } catch (Exception e){
            e.printStackTrace(); // Viser fejl i konsollen
        }
    }
}
