package org.effective.chapter01.item05.singleton;

import org.effective.chapter01.item05.DictionaryV1;

import java.util.List;

public class SpellChecker {

    private static final DictionaryV1 dictionary = new DictionaryV1();

    private static final SpellChecker INSTANCE = new SpellChecker();

    public SpellChecker() {
    }

    public static boolean isValid(String word){
        return dictionary.contains(word);
    }

    public static List<String> suggestions(String type){
        return dictionary.closeWordsTo(type);
    }




}
