package io.github.mortenjenne.fridgechef.controller;

import io.github.mortenjenne.fridgechef.logic.AppManager;
import io.github.mortenjenne.fridgechef.logic.RecipeManager;
import io.github.mortenjenne.fridgechef.logic.SceneController;
import io.github.mortenjenne.fridgechef.model.Fridge;
import io.github.mortenjenne.fridgechef.model.Ingredient;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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
    private Fridge fridge;

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

    @FXML
    ComboBox<Ingredient> comboBox;

    @FXML
    Button removeButton;

    @FXML
    ImageView fridge1_1, fridge1_2, fridge1_3, fridge1_4, fridge1_5;
    @FXML
    ImageView fridge2_1, fridge2_2, fridge2_3, fridge2_4, fridge2_5;
    @FXML
    ImageView fridge3_1, fridge3_2, fridge3_3, fridge3_4, fridge3_5;

    List<ImageView> fridgeDisplay = new ArrayList<>();
    private Ingredient ingredient;
    private List<Ingredient> ingredientList = new ArrayList<>();
    private List<Ingredient> userFridge = new ArrayList<>();


    @Override
    public void setAppManager(AppManager appManager) {
        this.appManager = appManager;
        this.fridge = appManager.getFridge();
        //TODO loadStoredFridgeFromDatabase();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addViewsToList();

        searchButton.setOnAction(event -> {
            searchForIngredient();
        });

        addToFridgeButton.setOnAction(event -> {
            addIngredientsToFridge();
        });

        removeButton.setOnAction(event ->
                removeIngredientFromFridge());
    }

    private void removeIngredientFromFridge(){
        Ingredient selectedIngredient = comboBox.getValue();
        fridge.removeIngredientFromFridge(selectedIngredient);
        updateComboBox();
        updateFridgeDisplay();

    }

    private void updateComboBox(){
        userFridge = fridge.getIngredientsInFridge();
        if(!userFridge.isEmpty()) {
            comboBox.getItems().setAll(fridge.getIngredientsInFridge());
        }
    }

    private void loadStoredFridgeFromDatabase(){
        //TODO Tag fra database
        List<Ingredient> storedIngredients = appManager.loadFridgeIngredients();

        for(Ingredient storedIngredient: storedIngredients){
            for(ImageView view: fridgeDisplay){
                if(view.getImage() == null){
                    view.setImage(new Image(storedIngredient.getApiURL()));
                    break;
                }
            }
        }
    }

    private void updateFridgeDisplay() {
        for (ImageView view : fridgeDisplay) {
            view.setImage(null);
        }

        List<Ingredient> updatedFridge = fridge.getIngredientsInFridge();

        for (int i = 0; i < updatedFridge.size() && i < fridgeDisplay.size(); i++) {
            fridgeDisplay.get(i).setImage(new Image(updatedFridge.get(i).getApiURL()));
        }
    }

    private void searchForIngredient(){
        try {
            ingredientList = appManager.searchIngredients(searchText.getText());
        } catch (Exception e) {
            System.out.println("Error test");
        }
        if (ingredientList != null && !ingredientList.isEmpty()) {
            ingredient = ingredientList.get(0);

            searchLabel.setText(ingredient.getName());
            searchImage.setImage(new Image(ingredient.getApiURL()));
        } else {
            searchLabel.setText("No ingredient found");
            searchImage.setImage(null);
        }
    }

    private void addIngredientsToFridge(){
        if (ingredient == null) return;
        fridge.addIngredientToFridge(ingredient);
        updateComboBox();

        for (int i = 0; i < fridgeDisplay.size(); i++) {
            ImageView view = fridgeDisplay.get(i);
            if (view.getImage() == null) {
                view.setImage(new Image(ingredient.getApiURL()));
                break;
            }
        }
    }

    private void addViewsToList(){
        fridgeDisplay.addAll(List.of(fridge1_1, fridge1_2, fridge1_3, fridge1_4, fridge1_5,
                fridge2_1, fridge2_2, fridge2_3, fridge2_4, fridge2_5,
                fridge3_1, fridge3_2, fridge3_3, fridge3_4, fridge3_5));
    }


}
