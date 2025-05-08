package io.github.mortenjenne.frigdechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class RecipeApiClient {
    private final String apiSearchByRecipe = "https://api.spoonacular.com/recipes/complexSearch";
    private final String apiKey = "e46029883b574497bbdc4df0b9806361";

    public String fetchRecipesByTitle(String query) throws Exception{
        String endpoint = apiSearchByRecipe + "?query=" + query + "&number=100&apiKey=" + apiKey;
        HttpURLConnection connection = (HttpURLConnection) new URL(endpoint).openConnection();
        connection.setRequestMethod("GET");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            return response.toString();
        }
    }

    public String fetchRecipesByCuisine(String cuisine) throws Exception{
        String endpoint = apiSearchByRecipe + "?cuisine=" + cuisine + "&number=100&apiKey=" + apiKey;
        HttpURLConnection connection = (HttpURLConnection) new URL(endpoint).openConnection();
        connection.setRequestMethod("GET");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            return response.toString();
        }
    }
   //Not used
    public List<Dish> getRecipes(String query) throws Exception {
        String jsonResponse = fetchRecipesByTitle(query);
        RecipeJsonParser parser = new RecipeJsonParser();
        return parser.parseRecipes(jsonResponse);
    }
    //Not used
    public List<Dish> getRecipesByCuisine(String query) throws Exception {
        String jsonResponse = fetchRecipesByCuisine(query);
        RecipeJsonParser parser = new RecipeJsonParser();
        return parser.parseRecipes(jsonResponse);
    }

}
