package org.effective.chapter01.item06;

import java.util.regex.Pattern;

public class RegularExpression {

    private static final Pattern SPLIT_PATTERN = Pattern.compile(",");

    public static void main(String[] args) {
        long start = System.nanoTime();
        for (int i = 0; i < 10000 ; i++) {
            String name = "effectiva,java";
            name.split(",");
            SPLIT_PATTERN.split(name);

        }
        System.out.println(System.nanoTime() - start);
    }

}
