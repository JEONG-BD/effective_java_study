package org.effective.chapter01.item03.functionalinterface;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DefaultFucnction {

    public static void main(String[] args) {
        Function<Integer, String> intToString = Objects::toString;
        Consumer<Integer> integerConsumer;

        Predicate<Integer> predicate;

    }
}
