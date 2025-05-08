package io.github.mortenjenne.frigdechef;

import com.google.gson.Gson;
import java.util.List;

public class RecipeJsonParser {
    private Gson gson = new Gson();

    public List<Dish> parseRecipes(String jsonResponse) {
        RecipeResponse response = gson.fromJson(jsonResponse, RecipeResponse.class);
        return response.getResults();
    }
}
