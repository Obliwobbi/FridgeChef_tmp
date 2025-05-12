package io.github.mortenjenne.fridgechef.controller;

import io.github.mortenjenne.fridgechef.logic.AppManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class RecipeController {
    private AppManager appManager;

    @FXML private Label recipeNameLabel;
    @FXML private ImageView recipeWidget;
    @FXML private Button returnButton;
}
