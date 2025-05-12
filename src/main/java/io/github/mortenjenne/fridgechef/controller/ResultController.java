package io.github.mortenjenne.fridgechef.controller;

import io.github.mortenjenne.fridgechef.logic.AppManager;
import io.github.mortenjenne.fridgechef.logic.SceneController;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.fxml.FXML;

import java.net.URL;
import java.util.ResourceBundle;

public class ResultController implements Initializable, SceneController {
    private AppManager appManager;

    @FXML private Label dishOne;
    @FXML private Label dishTwo;
    @FXML private Label dishThree;
    @FXML private Label dishFour;
    @FXML private Label dishFive;
    @FXML private Label dishSix;
    @FXML private ImageView dishOneImg;
    @FXML private ImageView dishTwoImg;
    @FXML private ImageView dishThreeImg;
    @FXML private ImageView dishFourImg;
    @FXML private ImageView dishFiveImg;
    @FXML private ImageView dishSixImg;
    @FXML private Button returnButton;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    private void viewRecipe(){
        // TODO vievRecipe() body
    }

    @Override
    public void setAppManager(AppManager appManager) {
        this.appManager = appManager;
    }
}
