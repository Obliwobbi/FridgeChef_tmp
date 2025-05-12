package io.github.mortenjenne.fridgechef.controller;

import io.github.mortenjenne.fridgechef.logic.SceneController;
import io.github.mortenjenne.fridgechef.logic.SceneNavigator;
import io.github.mortenjenne.fridgechef.logic.View;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class MainMenuController implements Initializable, SceneController {
    private SceneNavigator sceneNavigator;
    @FXML
    private Button searchButton;
    @FXML
    private Button favoriteDishButton;
    @FXML
    private Button fridgeButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        searchButton.setOnAction(event -> sceneNavigator.switchTo(View.TEST));
        favoriteDishButton.setOnAction(event -> sceneNavigator.switchTo(View.LOGIN));
        fridgeButton.setOnAction(event -> sceneNavigator.switchTo(View.SEARCH));
    }

    @Override
    public void setSceneController(SceneNavigator sceneNavigator) {
        this.sceneNavigator = sceneNavigator;
    }
}
