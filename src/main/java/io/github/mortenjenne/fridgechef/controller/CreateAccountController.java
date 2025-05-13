package io.github.mortenjenne.fridgechef.controller;

import io.github.mortenjenne.fridgechef.logic.AppManager;
import io.github.mortenjenne.fridgechef.logic.SceneController;
import io.github.mortenjenne.fridgechef.logic.SceneNavigator;
import io.github.mortenjenne.fridgechef.logic.View;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;


import java.net.URL;
import java.util.ResourceBundle;

public class CreateAccountController implements Initializable, SceneController {
    private AppManager appManager;

    @FXML private Label emailErrorLabel;
    @FXML private Label passwordErrorLabel;
    @FXML private TextField firstNameTextField;
    @FXML private TextField emailTextField;
    @FXML private PasswordField passwordTextField;
    @FXML private PasswordField retypePasswordTextField;
    @FXML private Button createAccountButton;
    @FXML private Button returnButton;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        createAccountButton.setOnAction(event -> appManager.switchTo(View.MAIN));
        returnButton.setOnAction(event -> appManager.switchTo(View.LOGIN));

    }

    @Override
    public void setAppManager(AppManager appManager) {
        this.appManager = appManager;
    }
}
