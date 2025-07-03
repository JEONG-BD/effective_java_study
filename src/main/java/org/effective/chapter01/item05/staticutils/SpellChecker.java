
package org.effective.chapter01.item05.staticutils;

import org.effective.chapter01.item05.DefaultDictionary;
import org.effective.chapter01.item05.Dictionary;
import org.effective.chapter01.item05.DictionaryV1;

import java.util.List;

public class SpellChecker {

    private static final DictionaryV1 dictionary = new DictionaryV1();

    private SpellChecker() {

    }

    public static boolean isValid(String word){
        return dictionary.contains(word);
    }

    public static List<String> suggestions(String type){
        return dictionary.closeWordsTo(type);
    }
}
