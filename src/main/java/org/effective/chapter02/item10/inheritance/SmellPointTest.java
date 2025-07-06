package org.effective.chapter02.item10.inheritance;

import org.effective.chapter02.item10.Color;

public class SmellPointTest {
    public static void main(String[] args) {

        SmellPoint smellPoint = new SmellPoint(1, 0, "sweet");
        ColorPoint colorPoint = new ColorPoint(1, 0, Color.RED);
        smellPoint.equals(colorPoint);
    }
}
