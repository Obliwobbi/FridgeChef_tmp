package io.github.mortenjenne.fridgechef.controller;

import io.github.mortenjenne.fridgechef.logic.SceneController;
import io.github.mortenjenne.fridgechef.logic.SceneNavigator;
import io.github.mortenjenne.fridgechef.logic.View;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable, SceneController {
    private SceneNavigator sceneNavigator;

    @FXML
    private Button loginButton;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loginButton.setOnAction(event -> sceneNavigator.switchTo(View.MAIN));
    }

    @Override
    public void setSceneController(SceneNavigator sceneNavigator) {
        this.sceneNavigator = sceneNavigator;
    }
}
