package io.github.mortenjenne.fridgechef.logic;

import io.github.mortenjenne.fridgechef.model.Account;
import io.github.mortenjenne.fridgechef.util.DatabaseReader;
import io.github.mortenjenne.fridgechef.util.DatabaseWriter;

public class AppManager {
private RecipeManager recipeManager;
private Account currentUser;
private SceneNavigator sceneNavigator;
private DatabaseReader dbReader = new DatabaseReader();
private DatabaseWriter dbWriter = new DatabaseWriter();

public AppManager(SceneNavigator sceneNavigator, RecipeManager recipeManager){
    this.recipeManager = recipeManager;
    this.sceneNavigator = sceneNavigator;
}

public void switchTo(View view){
    sceneNavigator.switchTo(view);
}

public boolean login(String email, String password){
    if (dbReader.accountLogin(email,password)){
        return true;
    }
    return false;
}

public void createAccount(String accountName, String email, String password){

    currentUser = new Account(accountName,email,password);

}

public boolean isEmailValid(String email){
    // Email validering
    if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
        String emailNotValid = "E-mail format er ugyldigt.";
        return false;
    }
    return true;
}

public boolean isUserNameValid(String userName) {
    //String userName = "Indtast dit navn: Minimum 2 tegn langt.";
    if(userName.trim().length() < 2) {
        String errorMsg = "Brugernavn skal mindst være 2 tegn langt.";
        return true;
    } else {
        return false;
    }
}

public boolean isValidPassword(String password) {
    String passwordRequirements = "Indtast et password:\nKrav: min. 6 tegn, min 1 stort bogstav, min 1. lille bogstav, min 1 tal:";
    if (password == null || password.trim().isEmpty()) {
        String passwordIsEmpty = "Password kan ikke være tomt.";
        return false;
    }
    if (password.length() < 6) {
        String passwordToShort = "Password skal være mindst 6 tegn langt.";
        return false;
    }
    if (!password.matches(".*[A-Z].*")) {
        String passwordMinOneCapitalLetter = "Password skal indeholde mindst et stort bogstav.";
        return false;
    }
    if (!password.matches(".*[a-z].*")) {
        String passwordMinOneLowercaseLetter = "Password skal indeholde mindst et lille bogstav.";
        return false;
    }
    if (!password.matches(".*\\d.*")) {
        String passwordNeedsOneNumber = "Password skal indeholde mindst et tal.";
        return false;
    }
    return true;
}

public boolean isUserInSystem(String email){
    return false;
}

public boolean isPasswordIndentical(String password1, String password2){
    return password1.equals(password2);
}

}
