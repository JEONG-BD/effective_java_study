package org.effective.chapter01.item03.functionalinterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UsageOfFuncations {
    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(1982, 7, 15));
        dates.add(LocalDate.of(2001, 1, 29));
        dates.add(LocalDate.of(2022, 3, 9));
        dates.add(LocalDate.of(2024, 7, 10));
        Predicate<LocalDate> localDatePredicate = d -> d.isBefore(LocalDate.of(2000, 1, 1));
        Function<LocalDate, Integer> getYear = LocalDate::getYear;
        List<Integer> before2000 = dates.stream()
                .filter(localDatePredicate)
                .map(getYear)
                .collect(Collectors.toList());
    }
}
