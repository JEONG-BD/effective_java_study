package org.effective.chapter01.item03.methodreference;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    LocalDate birthday;

    public Person(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge(){
        return LocalDate.now().getYear() - birthday.getYear();
    }

    public static int compareByAge(Person a, Person b){
        return a.birthday.compareTo(b.birthday);
    }

    public int compareByAgeV2(Person b){
        return this.birthday.compareTo(b.birthday);
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(LocalDate.of(1982, 7, 15)));
        people.add(new Person(LocalDate.of(2011, 3, 2)));
        people.add(new Person(LocalDate.of(2013, 7, 15)));

        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.birthday.compareTo(o2.birthday);
            }
        });

        people.sort((p1, p2) -> p1.birthday.compareTo(p2.birthday));
        people.sort(Person::compareByAge);

        Comparator<Person> compareByAgeV2 = Person::compareByAgeV2;
        people.sort(compareByAgeV2);


        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(1982, 8, 18));
        dates.add(LocalDate.of(1982, 8, 18));
        dates.add(LocalDate.of(1982, 8, 18));
        List<Person> peoples = dates.stream().map(d -> new Person(d)).collect(Collectors.toList());

    }


}
