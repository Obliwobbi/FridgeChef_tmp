package io.github.mortenjenne.fridgechef.controller;

import io.github.mortenjenne.fridgechef.logic.SceneController;
import io.github.mortenjenne.fridgechef.logic.SceneNavigator;
import io.github.mortenjenne.fridgechef.logic.View;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class SearchController implements Initializable, SceneController {
    @FXML
    private Button searchRecipeButton;
    private SceneNavigator sceneNavigator;


    @Override
    public void setSceneController(SceneNavigator sceneNavigator) {
       this.sceneNavigator = sceneNavigator;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        searchRecipeButton.setOnAction(event -> sceneNavigator.switchTo(View.MAIN));


    }
}
