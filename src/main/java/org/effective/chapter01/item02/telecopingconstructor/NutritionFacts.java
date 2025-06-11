package org.effective.chapter01.item02.telecopingconstructor;

public class NutritionFacts {
    private final int servingSzie;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public NutritionFacts(int servingSzie, int servings){
        //this.servingSzie = servingSzie;
        //this.servings =servings;
        //this.calories = 0;
        //this.fat = 0;
        //this.sodium = 0;
        //this.carbohydrate = 0;
        this(servingSzie, servings, 0);
    }


    public NutritionFacts(int servingSzie, int servings,
                          int calories){
        //this.servingSzie = servingSzie;
        //this.servings =servings;
        //this.calories = calories;
        //this.fat = 0;
        //this.sodium = 0;
        //this.carbohydrate = 0;
        this(servingSzie, servings, calories, 0);
    }

    public NutritionFacts(int servingSzie, int servings,
                          int calories, int fat){
        //this.servingSzie = servingSzie;
        //this.servings =servings;
        //this.calories = calories;
        //this.fat = fat;
        //this.sodium = 0;
        //this.carbohydrate = 0;
        this(servingSzie, servings, calories, fat, 0);
    }

    public NutritionFacts(int servingSzie, int servings,
                          int calories, int fat, int sodium){
        //this.servingSzie = servingSzie;
        //this.servings =servings;
        //this.calories = calories;
        //this.fat = fat;
        //this.sodium = sodium;
        //this.carbohydrate = 0;
        this(servingSzie, servings, calories, fat, sodium, 0);
    }

    public NutritionFacts(int servingSzie, int servings,
                          int calories, int fat,
                          int sodium, int carbohydrate){
        this.servingSzie = servingSzie;
        this.servings =servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        // 점층적 생성자
        NutritionFacts cocaCola = new NutritionFacts(240, 8);

    }

}
