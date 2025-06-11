package org.effective.chapter01.item02.freeze;

import java.util.ArrayList;
import java.util.List;

public class ImmutablePerson {

    private String name;
    private int birthYear;
    private List<String> kids;

    public ImmutablePerson(String name, int birthYear) {
        this.birthYear = birthYear;
        this.name = name;
        this.kids = new ArrayList<>();
    }

    // 어렵다.
    public void setName(String name) {
        //checkIfObjectIsFrozen();
        this.name = name;
    }

    //private void checkIfObjectIsFrozen() {
    //    if(this.frozen()){
    //        throw  new IllegalStateException();
    //    }
    //}

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setKids(List<String> kids) {
        this.kids = kids;
    }

    public static void main(String[] args) {
         ImmutablePerson person = new ImmutablePerson("user1", 2000);
         //final
         //person.name = "user2";
         //person = new ImmutablePerson("user2", 2001);
    }

}
