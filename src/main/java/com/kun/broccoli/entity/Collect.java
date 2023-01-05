package com.kun.broccoli.entity;

import lombok.Data;

@Data
public class Collect {
    private int userId;
    private int recipeId;

    public Collect() {
    }

    public Collect(int userId, int recipeId) {
        this.userId = userId;
        this.recipeId = recipeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }
}
