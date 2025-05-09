package io.github.mortenjenne.frigdechef.util;

import io.github.mortenjenne.frigdechef.model.Dish;

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
