package org.effective.chapter01.item02.builder;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder(builderClassName = "Builder")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class NutritionFactsLombok {
    private final int servingSize ;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;


    public static void main(String[] args) {
        //NutritionFactsLombok nutritionFacts = new NutritionFactsLombokBuilder()
        //        .servings(10)
        //        .servingSize(20)
        //        .calories(30)
        //        .fat(40)
        //        .sodium(10)
        //        .carbohydrate(1)
        //        .build();
        NutritionFactsLombok nutritionFacts = new Builder()
                .servings(10)
                .servingSize(20)
                .calories(30)
                .fat(40)
                .sodium(10)
                .carbohydrate(1)
                .build();

    }

}
