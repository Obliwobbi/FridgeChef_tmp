package io.github.mortenjenne.fridgechef.util;

import com.google.gson.Gson;
import io.github.mortenjenne.fridgechef.model.Dish;

import java.util.List;

public class RecipeJsonParser {
    private Gson gson = new Gson();

    public List<Dish> parseRecipes(String jsonResponse) {
        RecipeResponse response = gson.fromJson(jsonResponse, RecipeResponse.class);
        return response.getResults();
    }
}
