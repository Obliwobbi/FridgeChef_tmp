package io.github.mortenjenne.fridgechef.model;

public class Ingredient {
    private int id;
    private String name;
    private String image;


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setImage(String imageUrl){
        this.image = imageUrl;
    }

    public int getId() {
        return id; }
    public String getName() {
        return name; }
    public String getImage() {
        return image; }
}
