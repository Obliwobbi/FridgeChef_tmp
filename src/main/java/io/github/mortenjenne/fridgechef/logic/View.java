package io.github.mortenjenne.fridgechef.logic;

public enum View {
    LOGIN("/io/github/mortenjenne/fridgechef/LoginScreen.fxml"),
    MAIN("/io/github/mortenjenne/fridgechef/MainMenu.fxml"),
    CREATE("/io/github/mortenjenne/fridgechef/CreateAccount.fxml"),
    SEARCH("/io/github/mortenjenne/fridgechef/SearchByIngredient.fxml"),
    TEST("/io/github/mortenjenne/fridgechef/hello-view.fxml");
    //FAVORITES(fileName);

    private String fileName;

    View(String fileName){
        this.fileName = fileName;
    }

    public String getFileName(){
        return this.fileName;
    }

}
