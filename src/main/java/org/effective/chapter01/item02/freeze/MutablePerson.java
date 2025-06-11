package org.effective.chapter01.item02.freeze;

import java.util.ArrayList;
import java.util.List;

public class MutablePerson {

    private final String name;
    private final int birthYear;
    private final List<String> kids;

    public MutablePerson(String name, int birthYear) {
        this.birthYear = birthYear;
        this.name = name;
        this.kids = new ArrayList<>();
    }

    public static void main(String[] args) {
         final MutablePerson person = new MutablePerson("user1", 2000);
         //final
         //person.name = "user2";
         //person = new ImmutablePerson("user2", 2001);
    }

}
