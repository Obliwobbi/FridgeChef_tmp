package io.github.mortenjenne.frigdechef;

import java.util.List;

public class RecipeResponse {
    private List<Dish> results;

    public List<Dish> getResults() {
        return results;
    }

    public void setResults(List<Dish> results) {
        this.results = results;
    }
}
