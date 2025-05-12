package io.github.mortenjenne.fridgechef.controller;

import io.github.mortenjenne.fridgechef.logic.AppManager;
import io.github.mortenjenne.fridgechef.logic.SceneController;
import io.github.mortenjenne.fridgechef.model.Ingredient;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class FridgeController implements Initializable, SceneController {
    private AppManager appManager;

    @FXML
    private Button addToFridgeButton;

    @FXML
    private Button searchButton;

    @FXML
    private Label searchLabel;
    @FXML
    private ImageView searchImage;
    @FXML
    private TextField searchText;

    private List<Ingredient> ingredientList;

    @Override
    public void setAppManager(AppManager appManager) {
        this.appManager = appManager;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        searchButton.setOnAction(event -> {
            ingredientList = appManager.searchIngredients(searchText.getText());

            if (ingredientList != null && !ingredientList.isEmpty()) {
                Ingredient ingredient = ingredientList.get(0);
                searchLabel.setText(ingredient.getName());

                String imageUrl = "https://spoonacular.com/cdn/ingredients_250x250/" + ingredient.getImage();

                // Sæt billedet
                searchImage.setImage(new Image(imageUrl));
            } else {
                searchLabel.setText("Ingen ingredienser fundet");
                searchImage.setImage(null);
            }
        });
    }
}
