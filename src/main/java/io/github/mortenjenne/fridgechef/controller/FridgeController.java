package io.github.mortenjenne.fridgechef.controller;

import io.github.mortenjenne.fridgechef.logic.AppManager;
import io.github.mortenjenne.fridgechef.logic.RecipeManager;
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
import java.util.ArrayList;
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

    @FXML ImageView fridge1_1, fridge1_2, fridge1_3, fridge1_4, fridge1_5;
    @FXML ImageView fridge2_1, fridge2_2, fridge2_3, fridge2_4, fridge2_5;
    @FXML ImageView fridge3_1, fridge3_2, fridge3_3, fridge3_4, fridge3_5;

    List<ImageView> fridge;

    private Ingredient ingredient;

    private List<Ingredient> ingredientList = new ArrayList<>();

    @Override
    public void setAppManager(AppManager appManager) {
        this.appManager = appManager;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        searchButton.setOnAction(event -> {

            try {
                ingredientList = appManager.searchIngredients(searchText.getText());
            } catch (Exception e){
                System.out.println("Error test");
            }
            if (ingredientList != null && !ingredientList.isEmpty()) {
                ingredient = ingredientList.get(0);
                searchLabel.setText(ingredient.getName());

                String imageUrl = ingredient.getApiURL();

                searchImage.setImage(new Image(ingredient.getApiURL()));
            } else {
                searchLabel.setText("Ingen ingredienser fundet");
                searchImage.setImage(null);
            }
        });

        addToFridgeButton.setOnAction(event ->
               fridge1_1.setImage(new Image("https://spoonacular.com/cdn/ingredients_250x250/" + ingredient.getImage())) );
    }

    private void searchIngredient(){

    }
}
