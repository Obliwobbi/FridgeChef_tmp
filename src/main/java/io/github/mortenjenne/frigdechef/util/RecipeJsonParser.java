package io.github.mortenjenne.frigdechef.util;

import com.google.gson.Gson;
import io.github.mortenjenne.frigdechef.model.Dish;

import java.util.List;

public class RecipeJsonParser {
    private Gson gson = new Gson();

    public List<Dish> parseRecipes(String jsonResponse) {
        RecipeResponse response = gson.fromJson(jsonResponse, RecipeResponse.class);
        return response.getResults();
    }
}
