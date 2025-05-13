package io.github.mortenjenne.fridgechef.controller;

import io.github.mortenjenne.fridgechef.logic.AppManager;
import io.github.mortenjenne.fridgechef.logic.SceneController;
import io.github.mortenjenne.fridgechef.logic.SceneNavigator;
import io.github.mortenjenne.fridgechef.logic.View;
import io.github.mortenjenne.fridgechef.model.Ingredient;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;


import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class SearchController implements Initializable, SceneController {
    private AppManager appManager;

    @FXML private Button searchRecipeButton;
    @FXML private CheckBox isVegetarian;
    @FXML private ChoiceBox<String> chooseCuisineBox;
    @FXML private ChoiceBox<Ingredient> chooseIngredientBox1;
    @FXML private ChoiceBox<Ingredient>  chooseIngredientBox2;
    @FXML private ChoiceBox<Ingredient>  chooseIngredientBox3;
    @FXML private Button returnButton;

    private String[] cuisines = {"Chinese","French", "Indian", "Italian", "Japanese", "Mexican", "Thai"};
    private List<Ingredient> ingredients;



    @Override
    public void setAppManager(AppManager appManager){
        this.appManager = appManager;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        searchRecipeButton.setOnAction(event -> appManager.switchTo(View.RESULT));
        returnButton.setOnAction(event -> appManager.switchTo(View.MAIN));

        chooseCuisineBox.getItems().addAll(cuisines);

        /*
        if(appManager.getIngredients() != null) {
            ingredients = appManager.getIngredients();
            chooseIngredientBox1.getItems().addAll(ingredients);
            chooseIngredientBox2.getItems().addAll(ingredients);
            chooseIngredientBox3.getItems().addAll(ingredients);
        }
        */
    }

    // Search methods from Class Diagram not added due to mismatch with "scene"

    private boolean isVegetarian(boolean isVegetarian){
        // TODO change name an code isVegetarian() body
        boolean findAppropriateName = isVegetarian;
        return findAppropriateName;
    }
}
