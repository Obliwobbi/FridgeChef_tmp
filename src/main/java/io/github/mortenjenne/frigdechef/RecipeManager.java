package io.github.mortenjenne.frigdechef;

import java.util.List;

public class RecipeManager {
    private RecipeApiClient apiClient;
    private RecipeJsonParser jsonParser;

    public RecipeManager() {
        this.apiClient = new RecipeApiClient();
        this.jsonParser = new RecipeJsonParser();
    }

    public List<Recipe> getRecipesByTitle(String ingredients) throws Exception {
        String jsonResponse = apiClient.fetchRecipesByTitle(ingredients);
        return jsonParser.parseRecipes(jsonResponse);
    }

    public List<Recipe> getRecipesByCuisine( String cuisine) throws Exception {
        String jsonResponse = apiClient.fetchRecipesByCuisine(cuisine);
        return jsonParser.parseRecipes(jsonResponse);
    }
}