package io.github.mortenjenne.frigdechef;

import com.google.gson.annotations.SerializedName;
import javafx.scene.image.Image;

public class Recipe {
    private int id;
    private String title;
    @SerializedName("image")
    private String image;

    // Gettere og settere
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String imageUrl){
        this.image = imageUrl;
    }

    public String getImageUrl(){
        return this.image;
    }
}
