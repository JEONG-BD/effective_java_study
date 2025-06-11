package org.effective.chapter01.item02.javabeans;

public class NutritionFacts {
    private int servingSzie = -1 ;
    private int servings = -1 ;
    private int calories = 0 ;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public NutritionFacts() {
    }

    public void setServingSzie(int val) {
        this.servingSzie = val;
    }

    public void setServings(int val) {
        this.servings = val;
    }

    public void setCalories(int val) {
        this.calories = val;
    }

    public void setFat(int val) {
        this.fat = val;
    }

    public void setSodium(int val) {
        this.sodium = val;
    }

    public void setCarbohydrate(int val) {
        this.carbohydrate = val;
    }

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts();
        cocaCola.setServingSzie(240);
        cocaCola.setCalories(8);
        cocaCola.setSodium(35);
        cocaCola.setCarbohydrate(27);

    }

}
