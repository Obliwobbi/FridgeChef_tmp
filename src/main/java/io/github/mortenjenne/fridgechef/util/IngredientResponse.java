package io.github.mortenjenne.fridgechef.util;

import io.github.mortenjenne.fridgechef.model.Ingredient;

import java.util.List;

public class IngredientResponse {
    private List<Ingredient> results;

    public List<Ingredient> getResults() {
        return results;
    }

    public void setResults(List<Ingredient> results) {
        this.results = results;
    }
}
