package org.effective.chapter01.item05.dependencyinjection;

import org.effective.chapter01.item05.Dictionary;
import org.effective.chapter01.item05.DictionaryV1;

import java.util.List;

public class SpellChecker {

    private final Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String type) {
        return dictionary.closeWordsTo(type);
    }
}
